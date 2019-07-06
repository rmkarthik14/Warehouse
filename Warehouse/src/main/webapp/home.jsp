<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warehouse</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<form action="products" id="product"></form> 
	<form action="location" id="location"></form>
	<form action="po" id="po"></form>
	<h1 class="heading">WareHouse</h1>
	<div class="btn">
	<button type="submit" class= "product-button" form = "product">Products</button>&nbsp
	<button type="submit" class= "location-button" form = "location">Location</button>&nbsp
	<button type="submit" form = "po">PO</button>
	</div>
</body>
</html>