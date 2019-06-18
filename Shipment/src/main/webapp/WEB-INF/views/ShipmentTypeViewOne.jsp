<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Shipment view</h3>
<table border="1">
<tr>
<th>Id</th><td>${ob.wid}</td>
</tr>
<tr>
<th>Mode</th><td>${ob.sMode}</td>
</tr>
<tr>
<th>Grade</th><td>${ob.sgrade}</td>
</tr>
<tr>
<th>Notes</th><td>${ob.note}</td>
</tr>
</table>
</body>
</html>