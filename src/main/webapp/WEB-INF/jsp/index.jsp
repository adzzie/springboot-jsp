<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SpringBoot + JSP</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
            <li><a href="/books">Books</a></li>
        </ul>
    </div>
</nav>

<div class="container">

    <h3>Welcome ...</h3>
    <p>Tutorial springboot + jsp + flyway (migration) + lombok (auto setter getter).</p>

    <h2>Books Table</h2>
    <p>List of books</p>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Code</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.code}</td>
                <td>${book.name}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>
