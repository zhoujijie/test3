<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>管理引入的js、css文件</title>

<!-- jQuery -->
<script type="text/javascript" src="${ctx}/static/jQuery/jQuery-3.3.1.js"></script>

<!-- 百度富文本编辑器 ueditor。这两个js的顺序不对的话会找不到UE对象 -->
<script type="text/javascript" src="${ctx}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${ctx}/ueditor/ueditor.all.js"></script>


</head>
</html>