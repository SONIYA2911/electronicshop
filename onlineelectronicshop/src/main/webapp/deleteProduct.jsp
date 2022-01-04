<%@  page import="com.onlineelectronicshop.daoImpl.ComponentDaoImpl"%>
  <%@ page import="com.onlineelectronicshop.model.Components" %>
  <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title her</title>
<style>
table,td,tr{
border:1px solid black;
border-collapse:collapse;
}
</style>
</head>
<body>
<form>
<table>
<tr>
<td>ComponentId</td>
<td>ComponentName</td>
<td>CategoryName</td>
<td>Description</td>
<td>TotalPrice</td>
<td>Add to cart</td>
</tr>
<%ComponentDaoImpl comDao=new ComponentDaoImpl();			
List<Components> componentList=comDao.showComponent();

for(int i=0;i<componentList.size();i++)
{
Components comDao1=componentList.get(i);
%>
<tr>
<td><%=comDao1.getCompoentId() %></td>
<td><%=comDao1.getComponentName()%></td>
<td><%=comDao1.getCategoryName()%></td>
<td><%=comDao1.getDescription() %></td>
<td><%=comDao1.getTotalPrice() %></td>
<td><a href="deleteProduct.jsp?produId=<%=comDao1.getCompoentId()%>">delete</a></td>
</tr>
<%} %>
<%int produId=Integer.parseInt(request.getParameter("produId"));
comDao.deleteComponent(produId);
%>

</body>
</html>