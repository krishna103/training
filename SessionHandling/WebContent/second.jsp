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
<c:if test="${empty sessionScope.isLogged}">
<%out.println("Is New Session := "+session.isNew());
out.println(" Session Id:="+session.getId());
%>
<c:set scope="session" value="You are not logged" var="errorMessage"></c:set>
session.invalidate();
<jsp:forward page="index.jsp"/>

</c:if>
<%
out.println("Is New Session := "+session.isNew());
out.println(" Session Id:="+session.getId());
%>
</body>
</html>