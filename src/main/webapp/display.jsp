<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="user" class="org.iims.servletdemos.User" scope="session"/>
<jsp:setProperty property="*" name="user"/>
<%@include file="fragment/header.jsp" %>

<div class="container">
  <label>Name:</label>
  <jsp:getProperty property="name" name="user"/>

  <label>Contact:</label>
  <jsp:getProperty property="contactNumber" name="user"/>

  <label>Address:</label>
  <jsp:getProperty property="address" name="user"/>
</div>

<%@include file="fragment/footer.jsp" %>