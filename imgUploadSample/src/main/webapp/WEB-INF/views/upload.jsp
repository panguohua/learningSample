<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String basePath = request.getContextPath();
%>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="img">
    <input type="submit" name="提交">
</form><br /> 
<c:if test="${filePath!=null }">
    <h1>上传的图片</h1><br /> 
    <img width="300px" src="<%=basePath %>${filePath}"/>
</c:if>
</body>
</html>