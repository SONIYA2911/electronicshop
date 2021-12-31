<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<form action="login" class="form" method="post">
        <h2>Login</h2>
        <div class="input-group">
            <label for="loginemail">Email</label>
            <input type="text" name="loginemail" id="loginemail" required>
            
        </div>
        <div class="input-group">
            <label for="loginpassword">Password</label>
            <input type="password" name="loginpassword" id="loginpassword" required>
        </div>
        <input type="submit" value="login" class="submit-btn"><br>
        </form>
</body>
</html>