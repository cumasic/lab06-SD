<%-- 
    Document   : Error
    Created on : 2 jun. 2024, 20:49:13
    Author     : ACER
--%>

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h1>¡Ha ocurrido un error!</h1>
    <p>Mensaje: ${exception.message}</p>
    <p>Detalles: <%= exception.toString() %></p>
    <ul>
        <% 
        // Suponiendo que se pasa un vector de mensajes
        if (request.getAttribute("errorMessages") != null) {
            java.util.Vector<String> errorMessages = (java.util.Vector<String>) request.getAttribute("errorMessages");
            for (String message : errorMessages) {
                out.println("<li>" + message + "</li>");
            }
        }
        %>
    </ul>
</body>
</html>
