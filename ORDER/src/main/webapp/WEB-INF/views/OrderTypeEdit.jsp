<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<form:form action="update" method="POST" modelAttribute="orderType">
<pre>
Order Id:
<form:input path="id" readonly="true"/>

Order mode:
<form:radiobutton path="orderMode" value="sale"/>Sale
<form:radiobutton path="orderMode" value="purchase"/>Purchase
Order Code:
<form:input path="orderCode"/>
Order Type:
<form:select path="orderTypes">
<form:option value="">--select--</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select>
Order Accept:
<form:checkbox path="accept" value="MULTI MODEL"/>MULTI-MODEL
<form:checkbox path="accept" value="ACCEPT-RETURN"/>ACCEPT-RETURN
<form:checkbox path="accept" value="SERVICE-EXTENDED"/>SERVICE-EXTENDED
Note:
<form:input path="description"/>
<input type="submit" value="Upate"/>
</pre>
</form:form>
</body>
</html>