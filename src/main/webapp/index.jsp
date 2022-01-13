<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="fragment/header.jsp" %>
<div class="container table-container">
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/student-save">Add</a>
    <table>
        <tr>
            <th>ID</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Address</th>
            <th>Contact</th>
            <th>Action</th>
        </tr>

        <c:forEach var="student" items="${students}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.firstName}"/></td>
                <td><c:out value="${student.lastName}"/></td>
                <td><c:out value="${student.address}"/></td>
                <td><c:out value="${student.phoneNumber}"/></td>
                <td>
                    <a class="btn btn-edit"
                       href="${pageContext.request.contextPath}/student-save?id=<c:out value="${student.id}"/>">Edit</a>
                    <a class="btn btn-danger"
                       href="${pageContext.request.contextPath}/student?id=<c:out value="${student.id}"/>">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
<%@include file="fragment/footer.jsp" %>
