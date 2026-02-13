<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-sm">
                <div class="card-header bg-primary text-white">
                    <h4>Iniciar Sesión</h4>
                </div>
                <div class="card-body">
					<%
					    String errorParam = request.getParameter("error");
					    if ("1".equals(errorParam)) {
				    	
					%>
					    <div class="alert alert-danger" role="alert">
					        Usuario o contraseña incorrectos
					    </div>
					<%
					    }
					%>

                    <form action="LoginServlet" method="post">
                        <div class="mb-3">
                            <label for="usuario" class="form-label">Usuario</label>
                            <input type="text" class="form-control" id="usuario" name="usuario" required>
                        </div>
                        <div class="mb-3">
                            <label for="clave" class="form-label">Contraseña</label>
                            <input type="password" class="form-control" id="clave" name="clave" required>
                        </div>
                        <button type="submit" class="btn btn-success w-100">Entrar</button>
                    </form>
                    <div class="mt-3 text-center">
                        <a href="recuperar.jsp" class="text-decoration-none">¿Olvidaste tu contraseña?</a>
                        <br>
                        <a href="/somarte/registro-usuario" class="text-decoration-none">Registrar</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
