
  <%@  page import="com.onlineelectronicshop.daoImpl.ComponentDaoImpl"%>
  <%@ page import="com.onlineelectronicshop.model.Components" %>
  <%@ page import="java.util.List" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of components</title>
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
<td>ComponentName</td>
<td>CategoryName</td>
<td>Description</td>
<td>TotalPrice</td>
</tr>
<%ComponentDaoImpl comDao=new ComponentDaoImpl();			
List<Components> componentList=comDao.showComponent();

for(int i=0;i<componentList.size();i++)
{
Components comDao1=componentList.get(i);
%>
<tr>
<td><%=componentList.get(i).getComponentId()%></td>
<td><%=comDao1.getComponentName()%></td>
<td><%=comDao1.getCategoryName()%></td>
<td><%=comDao1.getDescription() %></td>
<td><%=comDao1.getTotalPrice() %></td>
<td><a href="insertcart.jsp?produId=<%=comDao1.getComponentId()%>">Add Cart</a></td>
</tr>
<%} %>
</table>
</form>
</body>
</html>