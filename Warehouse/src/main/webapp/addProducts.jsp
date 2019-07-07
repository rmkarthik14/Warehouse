<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="nav-main">
		<ul>
			<li><a onclick="hideNav()" href="#add">Add Products</a></li>
			<li><a onclick="hideView()"href="#view">View Products</a></li>
			<li><a onclick="hideView()"href="#view">View All Products</a></li>
			<li><a onclick="hideDelete()"href="#delete">Delete Products</a></li>
		</ul>
</nav>
<div id="add">
<form class="form" action="addProducts">
		<h1>Add Products</h1>
		<p>Enter Product Id:</p> 		<input type="text" name="pid"><br>
		<p>Enter Product Name:</p> 		<input type="text" name="pname"><br>
		<p>Enter Product Quantity:</p>	<input type="text" name="pquantity"><br>
		<button type="submit" class="submitButton">Add</button><br>
</form>
</div>

<div id="view" style="display: none;">
<form class="form" action="viewProducts">
		<h1>View Products</h1>
		<p>Enter Product Id:</p> <input type="text" name="pid"><br>
		<button type="submit" class="submitButton">View</button><br>
</form>

<form class="form" action="viewAllProducts">
		<h1>View All Products</h1>
		<button type="submit" class="submitButton">View All</button><br>
</form>
</div>

<div id="delete" style="display: none;">
<form class="form" action="deleteProducts">
		<h1>Delete Products</h1>
		<p>Enter Product Id:</p> <input type="text" name="pid"><br>
		<button type="submit" class="submitButton">Delete</button><br>
</form>
</div>
</body>
<script src="/javaScript/script.js"></script>
</html>