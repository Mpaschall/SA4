
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recommendation</title>
    </head>
    <body>
        <h2>Your recommended purchase is</h2>
        <br>
        
        <!--Gets recommended item properties-->
        Item : <jsp:getProperty name="qb" property="a1"/>
        <br>
        Type : <jsp:getProperty name="qb" property="a2"/>
        <br>
        Quality : <jsp:getProperty name="qb" property="a3"/>
    </body>
</html>
