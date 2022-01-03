<%@ page import="com.onlineelectronicshop.daoImpl.UserDaoImpl"%>
  <%@ page import="com.onlineelectronicshop.model.User"%>
  <%@ page import="java.util.List" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show all user</title>
<style>
table,td,tr{
border:1px solid black;
border-collapse:collapse;
}
</style>
</head>
<body>
<form >
<table>
<tr>
<td>UserName</td>
<td>EmailId</td>
<td>Password</td>
<td>ContactNumber</td>
<td>Address</td>
</tr>
<%UserDaoImpl userDao=new UserDaoImpl();			
List<User> UsersList=userDao.showAllUser();

for(int i=0;i<UsersList.size();i++) {
	
	User user=UsersList.get(i);
%>
<tr>
<td><%=user.getUserName()%></td>
<td><%=user.getEmailId() %></td>
<td><%=user.getPassword() %></td>
<td><%=user.getContactNumber()%></td>
<td><%=user.getAddress() %></td>
</tr><%} %>
</table>
</form>
</body>
</html>