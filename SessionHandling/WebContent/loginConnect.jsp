<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty sessionScope.isLogged}">
out.println("Is new Session := "+session.isNew());
out.println("session id := "+session.getId());
<p>Hello in login Connect</p>
</c:if>
</body>
</html>