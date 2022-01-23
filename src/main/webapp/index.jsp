<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@include file="fragment/header.jsp" %>
<h1>Hello World!</h1>
<jsp:forward page="print-date.jsp">
    <jsp:param name="todayDate" value="Today Date :"/>
</jsp:forward>
<%@include file="fragment/footer.jsp" %>
