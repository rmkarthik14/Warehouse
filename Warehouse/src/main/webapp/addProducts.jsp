<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
</head>
<body>
<form action="addProducts">
		<h1>Add Products</h1>
		Enter Product Id: <input type="text" name="pid"><br>
		Enter Product Name: <input type="text" name="pname"><br>
		Enter Product Quantity: <input type="text" name="pquantity"><br>
		<input type="submit"><br>
	</form>
-----------------------------------------------------------------------------------------------------------

<form action="viewProducts">
		<h1>View Products</h1>
		Enter Product Id: <input type="text" name="pid"><br>
		<input type="submit"><br>
</form>
-----------------------------------------------------------------------------------------------------------

<form action="deleteProducts">
		<h1>Delete Products</h1>
		Enter Product Id: <input type="text" name="pid"><br>
		<input type="submit"><br>
</form>
</body>
</html>