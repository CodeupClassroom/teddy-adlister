<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Create a repo" />
    </jsp:include>

</head>
<body>
    <jsp:include page="/partials/navbar.jsp" />
    <div class="container">

        Welcome ${username}

        Total: ${total}


        <c:forEach items="${repositories}" var="repo">
            ${repo.id} ${repo.name} <br>
        </c:forEach>

        <h1>Create a new repo</h1>
        <form action="/github/new" method="POST">
            <div class="form-group">
                <label for="name">name</label>
                <input id="name" name="name" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <input id="description" name="description" class="form-control" type="text">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Create">
        </form>
    </div>
</body>
</html>
