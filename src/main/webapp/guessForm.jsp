<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 3/29/18
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Form</title>
</head>
<body>

    <h1>Guess Form</h1>

    <form action="/guess" method="POST">

        <label for="userGuess">Number Guess</label>
        <input id="userGuess" type="text" name="userGuess" placeholder="Please guess a number">
        <button>Submit</button>

    </form>

</body>
</html>
