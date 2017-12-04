<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questions</title>
    </head>
    <body>
        <!--Get the proper question -->
        Question : <jsp:getProperty name="qb" property="question"/>
        <br>
        
        <!--Get the current count-->
        Count : <jsp:getProperty name="qb" property="sCount"/>
        <br>
        
        <!--Get the current question branch-->
        Question Branch : <jsp:getProperty name="qb" property="qNumber"/>
        
        <!--Form to get answer and redirect to servlet-->
        <form action="MyServlet" method="post">
            <input type="text" name="answer" required>
            <input type="submit" value="Continue">
        </form>
        
    </body>
</html>
