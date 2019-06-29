<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="purchaseOrderCreate">
		<h1>Create PO</h1>
		Enter PO ID: <input type="text" name="poid"><br>
		Enter PO Date: <input type="date" name="podate"><br>
		Enter Product ID: <input type="text" name="pid"><br>
		Enter Product quantity: <input type="text" name="quantity"><br>
		Enter PO Status: <input type="text" name="PoStatus"><br>
		<input type="submit"><br>
	</form>

<form action="purchaseOrder/view">
		<h1>Create PO</h1>
		Enter PO ID: <input type="text" name="poid"><br>
		<input type = "submit"><br>
</form>	

</body>
</html>