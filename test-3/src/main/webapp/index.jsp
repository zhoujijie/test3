<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<body>
	<h2>Hello World!</h2>
	<span>henhao</span>
	<a onclick="aa()">aa</a>
</body>
<script type="text/javascript">
	var jsonParam = {"a":"aaa","b":"bbc"};
	$(function(){ 
		$.ajax({
			type : "POST",
			contentType: "application/json;charset=UTF-8",
			url: "http://localhost:8080/test-3/test",
			data:JSON.stringify(jsonParam),
			success : function(jsondata) {
			  
			}
		});	
	});
		
</script>
</html>
