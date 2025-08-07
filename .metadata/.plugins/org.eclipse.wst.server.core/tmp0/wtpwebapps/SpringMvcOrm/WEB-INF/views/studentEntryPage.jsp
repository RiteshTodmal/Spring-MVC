<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

    <style type="text/css">
h1{
	color: red;
	text-align: center;
}



</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Enter Student Details</h1>
<hr>

<form action="studentEntry" method="post">
		
	Enter id: <input type="text" name="id"> <br> <br>
	
	Enter First Name : <input type="text" name="firstName"><br><br>
	
	Enter Last Name : <input type="text" name="lastName"><br><br>
	
	Enter City : <input type="text" name="city"><br><br>
	
	<input type="submit" name="Enter Student Data"/>	
	
</form>





















</body>
</html>