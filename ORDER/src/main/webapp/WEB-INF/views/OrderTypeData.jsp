<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All</title>
</head>
<body>
<h3>welcome to order data page.</h3>
<table border="1">
<tr>
<th>ID</th>
<th>OrderMode</th>
<th>OrderCode</th>
<th>OrderTypes</th>
<th>Accept</th>
<th>Description</th>
<th colspan="2">Operations</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td><c:out value="${ob.id}"/></td>
<td><c:out value="${ob.orderMode}"/></td>
<td><c:out value="${ob.orderCode}"/></td>
<td><c:out value="${ob.orderTypes}"/></td>
<td><c:out value="${ob.accept}"/></td>
<td><c:out value="${ob.description}"/></td>
<td><a href="edit?id=${ob.id}">EDIT</a>
<td><a href="delete?id=${ob.id}">DELETE</a>
<td><a href="view?id=${ob.id}">View</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>