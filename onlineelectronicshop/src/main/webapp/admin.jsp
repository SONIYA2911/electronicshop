<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body>
<form action="admin.jsp">
<label>List of users</label><br>
<a href="showuser.jsp">Show all user</a>
</form>
<br>
<form>
<label>Show Components</label>
<a href="showproduct.jsp">Show all components</a>
</form>
<br>
<form action="DeleteProductServlet">
Enter productId:
<input type="text" name="componentId">
<button type="submit">delete</button> 
</form>
</body>
</html>