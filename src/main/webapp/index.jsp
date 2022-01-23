<%@include file="fragment/header.jsp" %>
<div class="container form-container">
    <form action="display.jsp" method="POST">
        <div class="row">
            <div class="col-25">
                <label for="name">Name: </label>
            </div>
            <div class="col-75">
                <input id="name" name="name" required type="text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="address">Address: </label>
            </div>
            <div class="col-75">
                <input id="address" name="address" required type="text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="contactNumber">Contact: </label>
            </div>
            <div class="col-75">
                <input id="contactNumber" name="contactNumber" required type="text"/>
            </div>
        </div>

        <div class="row">
            <div class="col-75">
                <input type="submit" value="Submit">
            </div>
        </div>

    </form>
</div>
<%@include file="fragment/footer.jsp" %>