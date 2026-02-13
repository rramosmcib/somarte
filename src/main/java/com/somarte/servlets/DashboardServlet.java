package com.somarte.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(urlPatterns = {"/home", "/ingreso", "/salida", "/movimientos", "/cerrar-dia"})
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String path = request.getServletPath();

        switch (path) {
            case "/home":
                request.getRequestDispatcher("/views/home.jsp").forward(request, response);
                break;

            case "/ingreso":
                request.getRequestDispatcher("/views/entrada.jsp").forward(request, response);
                break;

            case "/salida":
                request.getRequestDispatcher("/views/salida.jsp").forward(request, response);
                break;

            case "/movimientos":
                request.getRequestDispatcher("/views/movimientos.jsp").forward(request, response);
                break;

            case "/cerrar-dia":
                request.getRequestDispatcher("/views/cierre.jsp").forward(request, response);
                break;

            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}