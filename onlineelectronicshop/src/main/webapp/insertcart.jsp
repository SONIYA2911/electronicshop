<%@  page import="com.onlineelectronicshop.daoImpl.UserDaoImpl"%>
  <%@ page import="com.onlineelectronicshop.model.User"%>
  <%@  page import="com.onlineelectronicshop.daoImpl.ComponentDaoImpl"%>
  <%@ page import="com.onlineelectronicshop.model.Components" %>
  <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cart</title>
<style>
table,td,tr{
border:1px solid black;
border-collapse:collapse;
}
<%int productId=Integer.parseInt(request.getParameter("produId"));%>

</style>
</head>
<body>
<form action="insertcart.jsp">
</form>
</body>
</html>