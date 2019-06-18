<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<form:form action="update" method="POST" modelAttribute="shipmentType">
<pre>
Shipment Id:
<form:input path="wid" readOnly="true"/>
Shipment Mode:
<form:select path="sMode">
<form:option value=" ">--select--</form:option>
<form:option value="TRAIN">TRAIN</form:option>
<form:option value="SHIP">SHIP</form:option>
<form:option value="BUS">BUS</form:option>
<form:option value="AIR">AIR</form:option>
</form:select>
Shipment Code:
<form:input path="shipmentCode" readOnly="true"/>
Enable Shipment
<form:select path="enableShipment">
<form:option value="">--select--</form:option>
<form:option value="YES">yes</form:option>
<form:option value="NO">no</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="sgrade" value="A"/>A
<form:radiobutton path="sgrade" value="B"/>B
<form:radiobutton path="sgrade" value="C"/>C
Note:
<form:textarea path="note"/>
<input type="submit" value="Update"/>
</pre>
</form:form>
</body>
</html>