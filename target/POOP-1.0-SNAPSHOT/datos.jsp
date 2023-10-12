<%-- 
    Document   : datos
    Created on : 4 oct 2023, 06:33:35
    Author     : linar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String name = "Juan";
            out.println(name);
            out.println("<h2>Juan Perez</h2>");
        %>
    </body>
</html>
