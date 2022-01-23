<%--
    Document   : result
    Created on : Sep 27, 2020, 9:40:14 AM
    Author     : msii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="assets/css/style.css"/>
    <title>JSP Page</title>
</head>
<body class="container">
<span style="background-color: #cccccc; padding: 12px">The sum of two number is :
    <%
        out.print(request.getAttribute("sum"));
    %>
</span>
</body>
</html>
