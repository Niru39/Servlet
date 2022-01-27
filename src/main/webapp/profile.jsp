<%--
    Document   : profile
    Created on : Nov 19, 2018, 8:58:14 AM
    Author     : Nischal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
Welcome to your profile ${userName}
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>
