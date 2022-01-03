
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<form action="RegisterServlet" class="form" method="post">
        <div class="registerbox">
        <img src="avatar.png" class="avatar">
        <h1>Register Here</h1>
        <div class="input-group">
            <label for="registername">User Name</label>
            <input type="text" name="registername" id="registername" placeholder="your name" required>
        </div>
        <div class="input-group">
            <label for="registeremail">Email</label>
            <input type="text" name="registeremail" id="registeremail" placeholder="abc@gmail.com" required>
            </div>
        <div class="input-group">
            <label for="registerpassword">Password</label>
            <input type="password" name="registerpassword" id="registerpassword" required>  
        </div>
        <div class="input-group">
            <label for="registercontactnumber">Contact Number</label>
            <input type="number" name="registercontactnumber" id="registercontactnumber" required>
            </div>
            <div class="input-group">
                <label for="registeraddress">Address</label>
                <input type="text" name="registeraddress" id="registeraddress">
                </div>
        <input type="submit" value="submit" class="submit-btn">
    </form>
    </div>
        
</body>
</html>





