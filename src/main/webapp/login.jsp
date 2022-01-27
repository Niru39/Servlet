<%--
    Document   : login
    Created on : Nov 19, 2018, 8:42:09 AM
    Author     : Nischal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    UserName: <input type="text" name="userName"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="login">
</form>
</body>
</html>
