package com.somarte.servlets;

import com.somarte.models.Usuario;
import com.somarte.DAO.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/AgregarUsuario")
public class AgregarUsuarioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String usuario = request.getParameter("usuario");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("contraseña");
        String rol = request.getParameter("rol");

        Usuario nuevoUsuario = new Usuario(usuario, contraseña, email);
        nuevoUsuario.setRol(rol);

        UsuarioDAO dao = new UsuarioDAO();
        dao.insertar(nuevoUsuario);

        // Redirigir al login después de registrar
        response.sendRedirect("/somarte");
    }
}