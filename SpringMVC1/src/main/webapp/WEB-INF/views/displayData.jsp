<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Spring Data Transfer from controller to View</h1>

<hr>

<%
	String myName = (String)request.getAttribute("myName");
	Integer myId = (Integer)request.getAttribute("myId");
	List<String> myFriends = (List<String>)request.getAttribute("myFriends");
%>

<h1>My Name Is: <%=myName %></h1>
<br>
<h1>My Is Is: <%=myId %></h1>
<br>
<h1>My Friends are: </h1>

<% for(String s: myFriends) { %>

<h1>Friend's Name Is: <%=s %></h1>

<%} %>



</body>
</html>