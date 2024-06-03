<%-- 
    Document   : index
    Created on : 2 jun. 2024, 22:46:46
    Author     : ACER
--%>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="LoginServlet" method="post">
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username"><br><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password"><br><br>
        <input type="submit" value="Ingresar">
    </form>
</body>
</html>