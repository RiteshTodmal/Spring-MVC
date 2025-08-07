<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Upload File </h1>
<hr>

<form action="fileUpload" method="post" enctype="multipart/form-data">

Select File <br><br>

<input type="file" name="inputFile"/>
<input type="submit" name="Upload File">

</form>

</body>
</html>