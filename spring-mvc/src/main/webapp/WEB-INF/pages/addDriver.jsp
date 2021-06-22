<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" 
   prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Driver</title>
</head>
<body>
<form:form action="drivers" method="post">
        <label for="">ID</label>
        <form:input path="id"/>
        <label for="">Driver NAME</label>
        <form:input path="driverName"/><span style="color: #FF0000"><form:errors path="driverName"></form:errors></span>
        <label for="">Address</label>
        <form:input path="address"/>
        <label for="">Rating</label>
        <form:input path="rating"/>
        
        <input type="submit" value="Add" />
</form:form>
</body>
</html>