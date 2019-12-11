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
    <c:choose>
        <c:when test="${mode == 'WELCOME'}">
            <h3>Welcome ...</h3>
            <p>Tutorial springboot + jsp + flyway (migration) + lombok (auto setter getter).</p>
        </c:when>
        <c:when test="${mode == 'BOOK_LIST'}">
            <jsp:include page="book/index.jsp"></jsp:include>
        </c:when>
    </c:choose>



</div>

</body>
</html>
