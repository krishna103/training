<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Is new Session := "+session.isNew());
out.println("session id := "+session.getId());
%>
<c:set var="city" value="Chennai" scope="session" />
<span>City : </span><c:out value="${city}"></c:out>
<a href="first.jsp">First</a>
</body>
</html>