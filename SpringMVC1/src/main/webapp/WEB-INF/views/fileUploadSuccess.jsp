<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<%@ page isELIgnored = "false"%>      
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>File Upload Success</h1>
<hr>

<img alt="MyImage" src="<c:url  value="/resources/images/${image}" />"  height="400" width="300">

</html>