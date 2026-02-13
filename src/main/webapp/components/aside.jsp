<%@ page contentType="text/html;charset=UTF-8" %>
<div class="d-flex flex-column flex-shrink-0 p-3 bg-dark text-white" style="width: 250px; height: 100vh;">
    <a href="#" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
        <span class="fs-4">Somarte</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
        <li class="nav-item">
            <a href="home.jsp" class="nav-link text-white">
                <i class="bi bi-house"></i> Home
            </a>
        </li>
        <li>
            <a href="entrada.jsp" class="nav-link text-white">
                <i class="bi bi-box-arrow-in-down"></i> Control Stock Entrada
            </a>
        </li>
        <li>
            <a href="salida.jsp" class="nav-link text-white">
                <i class="bi bi-box-arrow-up"></i> Control Stock Salida
            </a>
        </li>
        <li>
            <a href="movimientos.jsp" class="nav-link text-white">
                <i class="bi bi-arrow-left-right"></i> Movimientos
            </a>
        </li>
        <li>
            <a href="cierre.jsp" class="nav-link text-white">
                <i class="bi bi-calendar-check"></i> Cierre Día
            </a>
        </li>
    </ul>
    <hr>
    <div class="dropdown">
        <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" data-bs-toggle="dropdown">
            <strong><%= session.getAttribute("usuario") %></strong>
        </a>
        <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
            <li><a class="dropdown-item" href="logout">Cerrar sesión</a></li>
        </ul>
    </div>
</div>