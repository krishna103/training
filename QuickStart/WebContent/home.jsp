<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div style="text-align: center">

<h1><c:out value="${heading.storeName}"></c:out></h1>
<h2><c:out value="${heading.location}"></c:out></h2>
<h3><c:out value="${heading.phoneNumber}"></c:out></h3>

</div>
<div>
<c:forEach begin="1" end="10" step="1" var="i" >
    <c:out value="${i}"/>
</c:forEach>
</div>
</body>
</html>