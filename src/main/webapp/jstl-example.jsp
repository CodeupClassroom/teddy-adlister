<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>JSTL Example</h1>

<c:if test="${false}">
   <h2>You will never see this</h2>
</c:if>

<c:if test="${true}">
    <h2>You will *always* see this.</h2>
</c:if>

<ul>
    <c:forEach var="n" items="${[1, 2, 3, 4, 5]}">
        <li>${n}</li>
    </c:forEach>
</ul>

</body>
</html>
