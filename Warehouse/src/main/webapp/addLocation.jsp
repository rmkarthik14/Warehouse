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
		<h1>Add Location</h1>
		Enter Location: <input type="text" name="lid"><br>
		<input type="submit"><br>
	</form>
	
------------------------------------------------------------------------------
<form action="addProductLocation">
		<h1>Add Product Location</h1>
		Enter Location Number: <input type="text" name="lid"><br>
		Enter Product Id: <input type="text" name="pid"><br>
		<input type="submit"><br>
	</form>

<form action="getLocationProd">
		<h1>Get Product Location</h1>
		Enter Location: <input type="text" name="lid"><br>
		<input type="submit"><br>
	</form>
	${obj} <br>
	
</body>
</html>