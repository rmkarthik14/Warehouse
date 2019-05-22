<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Display</title>
<style>
table {
  width:75%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
table#Pdisplay tr:nth-child(even) {
  background-color: #eee;
}
table#Pdisplay tr:nth-child(odd) {
 background-color: #fff;
}
table#Pdisplay th {
  background-color: black;
  color: white;
}
</style>
</head>
<body>
	<table id="Pdisplay">
  <tr>
    <th>Product ID</th>
    <th>Product</th> 
    <th>Quantity</th>
  </tr>
  <tr>
    <td>${products.getPid()}</td>
    <td>${products.getPname()}</td> 
    <td>${products.getPquantity()}</td>
  </tr>
</table>
</body>
</html>