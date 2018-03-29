<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 3/29/18
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Guess Results</title>
</head>
<body>

    <h1>${message}</h1>

    <c:if test="${!message.equals('You WON!')}">
        <a href="/guess">Guess Again</a>
    </c:if>

</body>
</html>
