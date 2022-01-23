<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="assets/css/style.css"/>
    <title>Implicit Objects</title>
</head>
<body>
<div class="container">
    <form action="add" method="post">
        <div class="row">
            <div class="col-25">
                <label for="numberOne">First Number:</label>
            </div>
            <div class="col-75">
                <input type="text" name="numberOne" id="numberOne" placeholder="Enter first number" required/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label for="numberTwo">Second Number:</label>
            </div>
            <div class="col-75">
                <input type="text" name="numberTwo" id="numberTwo" placeholder="Enter second number" required/>
            </div>
        </div>

        <div class="row">
            <button type="submit">Get Result</button>
        </div>

    </form>
</div>
</body>
</html>
