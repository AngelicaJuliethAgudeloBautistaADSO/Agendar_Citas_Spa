<%-- 
    Document   : edit
    Created on : 12/09/2024, 9:43:43 p. m.
    Author     : angel
--%>

<%@page import="Modelo.Cosmetologo"%>
<%@page import="ModeloDAO.CosmetologoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/cssAdmin/cssCosmetologo/edit.css"/>
    </head>
    <body>
        <div class="contenido">
            <div class="logo_inicio">
                <img class="img_logo" src="../imagenes/logo.png" alt="">
            </div>
            <%
                CosmetologoDAO dao=new CosmetologoDAO();
                int id=Integer.parseInt((String)request.getAttribute("idcosm"));
                Cosmetologo cosmet=(Cosmetologo)dao.list(id);
            %>
            <form action="ControlCosmetol">
                <p>Modificar</p> 
                <input type="text" name="txtNom" value="<%=cosmet.getNom()%>" placeholder="Nombre">
                <input type="text" name="txtApell" value="<%=cosmet.getApell()%>" placeholder="Apellido">
                <input type="text" name="txtTelef" value="<%=cosmet.getTelef()%>" placeholder="Telefono">
                <input type="text" name="txtEspecialidad" value="<%=cosmet.getEspeci()%>" placeholder="Especialidad">
                
                <input type="hidden" name="txtid" value="<%=cosmet.getId()%>">
                
                <input class="button" type="submit" name="accion" value="Actualizar">
                
                <%--<button type="submit" id="submit" name="accion" value="Agregar">
                    <a href="">Agregar</a>
                </button> --%>
            </form>
        </div>
    </body>
</html>
