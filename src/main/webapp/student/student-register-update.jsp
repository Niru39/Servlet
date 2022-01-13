<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../fragment/header.jsp" %>

<div class="container form-container">
    <form action="${pageContext.request.contextPath}/student-save" method="POST">

        <div class="row">
            <div class="col-25">
                <label for="firstName">FirstName: </label>
            </div>
            <div class="col-75">
                <input id="firstName" name="firstName" required type="text"
                       value="<c:out value='${student.firstName}'/>"/>
            </div>
        </div>

        <div class=" row">
            <div class="col-25">
                <label for="lastName">LastName: </label>
            </div>
            <div class="col-75">
                <input id="lastName" name="lastName" required type="text" value="<c:out value='${student.lastName}'/>"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="address">Address: </label>
            </div>
            <div class="col-75">
                <input id="address" name="address" required type="text" value="<c:out value='${student.address}'/>"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="phoneNumber">Phone Number: </label>
            </div>
            <div class="col-75">
                <input id="phoneNumber" name="phoneNumber" required type="text"
                       value="<c:out value='${student.phoneNumber}'/>"/>
            </div>
        </div>

        <input type="hidden" name="id" id="id" value="<c:out value='${student.id}' />"/>

        <div class="row">
            <div class="col-75">
                <input type="submit" value="<%=request.getAttribute("action")%>">
            </div>
        </div>

    </form>
</div>


<%@ include file="../fragment/footer.jsp" %>
