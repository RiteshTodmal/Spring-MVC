<%@page import="beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Data Submit Success</h1>
<hr>


<%-- <%
	String studentName = (String)request.getAttribute("studentName");
	String studentCity = (String)request.getAttribute("studentCity");
	String studentEmail = (String)request.getAttribute("studentEmail");
%>

<h1>**************Welcome : <%=studentName %>************</h1>
<hr>

<h2>My Name Is   : <%=studentName %></h2><br>
<h2>My City Is   : <%=studentCity %></h2><br>
<h2>My Email Is  : <%=studentEmail %></h2><br> --%>

<%
	Student s1 = (Student) request.getAttribute("student");
%>

<h2>My Name Is   : <%=s1.getStudentName()%></h2><br>
<h2>My City Is   : <%=s1.getStudentCity() %></h2><br>
<h2>My Email Is  : <%=s1.getStudentEmail()%></h2><br>


</body>
</html>