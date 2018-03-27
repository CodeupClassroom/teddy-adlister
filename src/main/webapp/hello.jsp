<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
   String name = request.getParameter("name");
   // our variables are null the first time the page is visited
   if (name == null) {
       name = "World";
   }
   if (name.equals("admin")) {
       // redirect to the admin page
       response.sendRedirect("/admin.jsp");
   }
%>

<html>
<head>
    <title>Hello There!</title>
</head>
<body>

<h1>Hello, <%= name %></h1>

<p>Please Enter Your Name:</p>

<form method="get" action="hello.jsp">
    <input type="text" name="name" />
</form>

</body>
</html>
