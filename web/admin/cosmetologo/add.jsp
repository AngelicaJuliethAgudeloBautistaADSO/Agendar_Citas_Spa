<%-- 
    Document   : add
    Created on : 12/09/2024, 9:43:37 p. m.
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/cssAdmin/cssCosmetologo/add.css"/>
    </head>
    <body>
        <div class="contenido">
            <div class="logo_inicio">
                <img class="img_logo" src="../imagenes/logo.png" alt="">
            </div>
            <form action="ControlCosmetol">
                <p>Agrega un nuevo</p> 
                <input type="text" name="txtNom" placeholder="Nombre">
                <input type="text" name="txtApell" placeholder="Apellido">
                <input type="text" name="txtTelef" placeholder="Telefono">
                <input type="text" name="txtEspecialidad" placeholder="Especialidad">

                <input class="button" type="submit" name="accion" value="Agregar">
                
                <%--<button type="submit" id="submit" name="accion" value="Agregar">
                    <a href="">Agregar</a>
                </button> --%>
            </form>
        </div>
    </body>
</html>
