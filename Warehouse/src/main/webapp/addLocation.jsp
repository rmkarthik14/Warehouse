<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
</head>
<body>
<form action="addLocation">
		<h1>Add Products</h1>
		Enter Location: <input type="text" name="lid"><br>
		Enter Location Number: <input type="text" name="lname"><br>
		<input type="submit"><br>
	</form>
------------------------------------------------------------------------------
<form action="productLocation">
		<h1>Add Location</h1>
		Enter Location Number: <input type="text" name="lid"><br>
		Enter Product Id: <input type="text" name="pide"><br>
		<input type="submit"><br>
	</form>
</body>
</html>