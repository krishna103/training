<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add book</title>
<link href="css/style.css" rel="stylesheet" >

</head>
<body>
<div>
<%@ include file="navigation.html" %>
</div>
<div>

<p style="color:blue"><c:out value="${message}"></c:out></p>


<form action="bookServlets" method="post">
	<label for="">Book Number</label>
	<input type="text" name="bookNumber" required="required" />
	<label for="">Book Name</label>
	<input type="text" name="bookName" required="required" />
	<label for="">Author</label>
	<input type="text" name="author" required="required" />
	<label for="">Category</label>
	
	<label>Sports</label>
	<input type="checkbox" name="category" value="sports"/>
	<label>Fiction</label>
	<input type="checkbox" name="category" value="fiction"/>
	<label>Science</label>
	<input type="checkbox" name="category" value="science"/>
	
	<input type="submit" value="Add" />
</form>
</div>
<div>
<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>