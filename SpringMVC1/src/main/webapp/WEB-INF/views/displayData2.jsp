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
<h1>Diplay Data Part : 2</h1>
<hr>
<br>
<%
	String myName = (String)request.getAttribute("myName");
	Integer id =(Integer) request.getAttribute("myId");
	List<String> friends =(List<String>) request.getAttribute("myFriends");

%>

<h1>My Name Is: <%=myName %></h1>
<h1>My Id Is <%=id %></h1>
<h1>My Friends Are: </h1>
<% for(String s:friends){%>
	<h1>My Friends Are: <%=s %></h1>
<%} %>
</body>
</html>