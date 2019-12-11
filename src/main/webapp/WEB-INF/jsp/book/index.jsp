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
