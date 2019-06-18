<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>
<h3>Welcome to shipment data</h3>
<table border="1">
<tr>
<th>ID</th>
<th>MODE</th>
<th>CODE</th>
<th>ENABLE</th>
<th>GRADE</th>
<th>NOTE</th>
<th colspan="3">OPERATION</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td><c:out value="${ob.wid}"/></td>
<td><c:out value="${ob.sMode}"/></td>
<td><c:out value="${ob.shipmentCode}"/></td>
<td><c:out value="${ob.enableShipment}"/></td>
<td><c:out value="${ob.sgrade}"/></td>
<td><c:out value="${ob.note}"/></td>
<td><a href="delete?id=${ob.wid}">DELETE</a>
<td><a href="edit?id=${ob.wid }">EDIT</a>
<td><a href="view?id=${ob.wid }">VIEW</a>
</td>
</c:forEach>
</table>
:${msg}
</body>
</html>