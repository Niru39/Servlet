<!DOCTYPE html>
<html lang="en">
<head>
    <title>Scripting Element</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
<div style="overflow-x: auto">
    <table class="container">
        <tr>
            <th>Scriptlet Tag</th>
            <th>Description</th>
        </tr>

        <tr>
            <td><a href="${pageContext.request.contextPath}/scriptlet-tag">Scriptlet</a></td>
            <td>Used to execute java source code in JSP</td>
        </tr>

        <tr>
            <td><a href="${pageContext.request.contextPath}/expression-tag">Expression</a></td>
            <td>Used to print response in order to remove the out.print() to write the data. It is mainly used to print
                the values of variables or method.
            </td>
        </tr>


        <tr>
            <td><a href="${pageContext.request.contextPath}/declaration-tag">Declaration</a></td>
            <td>Used to declare the fields and methods</td>
        </tr>

    </table>
</div>
</body>
</html>
