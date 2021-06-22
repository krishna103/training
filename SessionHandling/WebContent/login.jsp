<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<p style="color:#ff0000"><c:out value="${errorMessage}"></c:out></p>

<form action="session" method="post">
     <label for="">User Name</label>
     <input type="text" name="userName" required="required">
     <label for="">Password</label>
     <input type="password" name="password" required="required">
     <input type="submit" value="submit">
</form>
</body>
</html>