<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<%@include file="fragment/header.jsp" %>
<h1>Forward tag</h1>
<h1>
    <%= request.getParameter("todayDate") %>
    <% out.println(new Date());%>
</h1>
<%@include file="fragment/footer.jsp" %>
