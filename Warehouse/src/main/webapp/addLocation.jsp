<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="nav-main">
		<ul>
			<li><a onclick="hideloc()" href="#location">Add Location</a></li>
			<li><a onclick="hideprodloc()" href="#productLocation">Add Product Location</a></li>
			<li><a onclick="hidegetloc()" href="#getLocation">Get Product Location</a></li>
		</ul>
</nav>
<div id="location">
<form class="form" action="addLocation">
		<h1>Add Location</h1>
		<p>Enter Location:</p> <input type="text" name="lid"><br>
		<button type="submit" class="submitButton">Add</button><br>
	</form>
</div>	
<div id="productLocation" style="display: none;">
<form class="form" action="addProductLocation">
		<h1>Add Product Location</h1>
		<p>Enter Location Number:</p> <input type="text" name="lid"><br>
		<p>Enter Product Id:</p> <input type="text" name="pid"><br>
		<button type="submit" class="submitButton">Add</button><br>
	</form>
</div>
<div id="getLocation" style="display: none;">
<form class="form" action="getLocationProd">
		<h1>Get Product Location</h1>
		<p>Enter Location:</p> <input type="text" name="lid"><br>
		<button type="submit" class="submitButton">Add</button><br>
	</form>
	<H3>Location:${locationList.get(0).getLid()}</H3>
	<H3>Product:${locationList.get(0).getProducts()}</H3>	
</div>	
	
	
</body>
<script src="/javaScript/script.js"></script>
</html>