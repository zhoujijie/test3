<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../../common/include.jsp"%>
<title>Insert title here</title>
</head>
<body>

<div>
	<form action="${ctx}/ueditor/save" method="post">
    	<h1>完整demo</h1>
    	<script id="editor" type="text/plain" style="width:1024px;height:500px;"></script>
    	<input type="submit" value="提交">
    </form>
</div>
</body>

	<script type="text/javascript" name="content">
		var ue = UE.getEditor('editor');
	</script>


</html>