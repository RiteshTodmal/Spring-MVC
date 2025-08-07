<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored = "false" %>  

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>My Name Is: ${myName} </h1>

<hr>
<h2>My Friends Are:</h2>
<%
	List<String> myFriends = (List<String>)request.getAttribute("myFriends");
%>

<%for(String s : myFriends){%>
<h2>Friend's Name Is: <%=s %></h2>
<%} %>

<hr>

<h2>My Friends Are: </h2>

<c:forEach items="${myFriends}" var="f">
<h2>Friend's Name Is : ${f}</h2>
</c:forEach>


</body>
</html>