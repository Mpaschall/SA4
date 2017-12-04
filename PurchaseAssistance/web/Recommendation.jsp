
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recommendation</title>
    </head>
    <body>
        <h1>Your recommended purchase is</h1>
        <br>
        Array: <jsp:getProperty name="qb" property="question"/>
        <br>
        Count: <jsp:getProperty name="qb" property="sCount"/>
        Question: <jsp:getProperty name="qb" property="qNumber"/>
        <form action="MyServlet" method="post">
            <input type="text" name="answer">
            <input type="submit" value="Continue">
        </form>
    </body>
</html>
