<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- Initialize an instance variable --%>
<%! int counter = 0; %>

<%-- everytime we visit the page, increment --%>
<% counter += 1; %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="partials/welcome-message.jsp" />

<h1>The current count is <%= counter %>.</h1>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
