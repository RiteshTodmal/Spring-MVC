<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Data Entry</h1>
<hr>

<form action="submitStudentData" method="post">
Name : <input type="text" name="studentName"/><br><br>
City : <input type="text" name="studentCity"/><br><br>
Email: <input type="text" name="studentEmail"/><br><br>


<input type="submit" value="Submit Data">

</form>
</body>
</html>