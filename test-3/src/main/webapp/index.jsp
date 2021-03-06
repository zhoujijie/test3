<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="https://d3js.org/d3.v5.min.js"></script>
<style>

.chart rect {
  fill: steelblue;
}

.chart text {
  fill: white;
  font: 10px sans-serif;
  text-anchor: end;
}

</style>
<body>
<div id="chart">

</div>

</body>
<script type="text/javascript">

/* var svg = d3.select('#chart').append('svg');
svg.attr("width",300)
   .attr("height",200)
   .attr("background-color","steelblue")
   .append("circle")
   .attr("r",20)
   .attr("cx",80)
   .attr("cy",80)
   .attr("style","fill:steelblue;")
   .transition()
   .duration(3000)
   .attr("r",40) */

var data = [40,360,70,120,90,200,120,60]
var svg = d3.select('#chart').append('svg').attr("width",420).attr("height",200).attr("class","chart");

var bar = svg.selectAll("g").data(data).enter().append("g")
    .attr("transform", function(d, i) { return "translate(0," + i * 25 + ")"; });
    
function update(data,n) {  
	if (n == 0) {
		bar.append("rect")
		   .attr("width",function(d){return d})
		   .attr("height",20);

		bar.append("text")
		   .text(function(d) { return d; });
	} else {
		bar.select("rect").data(data).transition().duration(500).attr("width",function(d){return d;});
	}
	

}
update(data,0);


d3.interval(function() {
		var j = Math.random() + 2; 
		var zz = [];
		for (var i = 0;i<data.length;i++) {
			data[i] = data[i] + (Math.random() + 2 ) * 20;
		}
		update(data,1);
	});
	
d3.json("http://localhost:8080/myproject/d3/getJson",
	    function handle_json_data(data){
	        console.log(data)
	        console.log(data.results[0]);
	        var series=data.results[0].series;
	        var contents=series[0];
	        var values=contents.values
	        console.log(values);
	    });	

</script>
</html>
