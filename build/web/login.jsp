<%-- 
    Document   : login
    Created on : 13/09/2024, 7:47:43 a. m.
    Author     : Propietario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="logo_inicio">
            <img class="img_logo" src="../imagenes/logo.png" alt="">
        </div>
        <div class="contenido">
            <h1>¡Bienvenido/a!</h1>
            <p >Esperamos que disfrutes de una experiencia relajante y rejuvenecedora</p>    

            <form>
                <label for="Correo"></label>
                <input id="Correo" name="Correo" placeholder="Correo electronico" autocomplete="off">

                <label for="contrasena"></label>
                <input id="contrasena" name="contrasena" placeholder="Contraseña" autocomplete="off">

                <button type="summit" id="summit"><a href="/panel_admin/panel_inicio_admin.html">Ingresar</a></button>    
            </form>
            <!-- <script src="inicio.js"></script> -->
            <div class="login-link">
                <p class="p_login">¿Aun no tienes cuenta? 
                <a href="inicio.html">Registrarte</a></p>
            </div>
        </div>
    </body>
</html>
