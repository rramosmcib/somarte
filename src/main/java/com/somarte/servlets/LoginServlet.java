package com.somarte.servlets;

import com.somarte.DAO.UsuarioDAO;
import com.somarte.models.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.validarLogin(usuario, clave);

        if (u != null) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", u.getUsuario());
            sesion.setAttribute("rol", u.getRol());
            response.sendRedirect("home"); // Servlet que muestra el menú
        } else {
            response.sendRedirect(request.getContextPath() + "/?error=1");
        }
    }
}