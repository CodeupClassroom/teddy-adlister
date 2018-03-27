<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>

<%
    String message = "Hello, ";
    message += "World";
    message += "!";


    boolean isLoggedIn = false;

    int[] numbers = new int[]{1, 2, 3, 4, 5};

%>

<nav>

</nav>

<% if (isLoggedIn) { %>
    <div class="admin-area">
        <div class="row">
            <%= "Secret Admin Area" %>
        </div>
    </div>
<% } %>

<h1>Here are some numbers:</h1>

<ul>
    <% for (int number : numbers) { %>
        <li><%= number %></li>
    <% } %>
</ul>

<!-- Here is a nice little comment... -->

<!-- What might amazon's backend look like? -->

<% for (Product product : products) { %>

<div class="product">
    <h1>
        <a href="<%= product.getUrl() %>">
            <%= product.getName() %>
        </a>
    </h1>
    <img src="<%= product.getImgUrl()%>" alt="<%= product.getDescription()%>">
    <p><%= product.furtherDetails() %></p>
</div>

<% } %>
</body>
</html>
