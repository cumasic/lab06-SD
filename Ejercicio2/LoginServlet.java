package login.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Vector;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp"); // Redirigir a la página de login si se accede mediante GET
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Vector<String> errorMessages = new Vector<>();

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            errorMessages.add("Los campos no pueden estar vacios.");
        }
        
        else if (!username.equals("usuario") || !password.equals("contrasena")) {
            errorMessages.add("El nombre de usuario o la contraseña son incorrectos.");
        }

        if (!errorMessages.isEmpty()) {
            request.setAttribute("errorMessages", errorMessages);
            throw new ServletException("Datos de login inválidos.");
        }

        // Aquí iría la lógica en caso de que el login sea correcto
        response.sendRedirect("Bienvenido.jsp");
    }
}