<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Cosmetologo"%>
<%@page import="ModeloDAO.CosmetologoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="listar.css"/>
    </head>
    <body>
        <div class="contenedor">
            <aside class="contenedor_lateral">
                <div class="cont_logo">
                    <img src="../imagenes/logo.png" alt="">
                    <p>Cosmetología y Estética Integral</p>
                </div>
                <button class="boton_logo">
                    <a href="index.html">Cerrar sesion</a>
                </button>
                <nav class="nav_logo">
                    <button class="button_nav_logo" >
                        <a href="panel_inicio_admin.html">Panel de inicio</a>
                    </button>
                    <button class="button_nav_logo" >
                        <a href="panel_cosmetologo_admin.html">Cosmetologo/a</a>
                    </button>
                    <button class="button_nav_logo" >
                        <a href="panel_calendario_admin.html">Calendario</a>
                    </button>
                    <button class="button_nav_logo" >
                        <a href="panel_cita_admin.html">Citas</a>
                    </button>
                    <button class="button_nav_logo" >
                        <a href="panel_usuarios_admin.html">Usuarios</a>
                    </button>
                    <button class="button_nav_logo" >
                        <a href="panel_servicios_admin.html">Servicios</a>
                    </button>
                </nav>
            </aside>
            <main class="cont_logo">
                <div class="panel">
                    <div class="contenido_principal">
                        <h2 class="h2_principal">Cosmetologo</h2>
                        <button class="boton_panel"></button>
                        
                        <a href="ControlCosmetol?accion=add">+ Agregar nuevo</a>
                        
                        <table class="tabla_principal" border="1">
                            <thead class="thead_tabla">
                                <tr class="tr_tabla">
                                    <th class="th_tabla">Id</th>
                                    <th class="th_tabla">Nombre</th>
                                    <th class="th_tabla">Apellido</th>
                                    <th class="th_tabla">Telefono</th>
                                    <th class="th_tabla">Especialidad</th>
                                    <th class="th_tabla">Acciones</th>
                                </tr>
                            </thead>
                            <%
                                CosmetologoDAO dao=new CosmetologoDAO();
                                List<Cosmetologo>list=dao.listar();
                                Iterator<Cosmetologo>iter=list.iterator();
                                Cosmetologo cosm=null;

                                while (iter.hasNext()) {
                                        cosm=iter.next();

                            %>
                            <tbody>
                                <tr>
                                    <td><%= cosm.getId()%></td>
                                    <td><%= cosm.getNom()%></td>
                                    <td><%= cosm.getApell()%></td>
                                    <td><%= cosm.getTelef()%></td>
                                    <td><%= cosm.getEspeci()%></td>
                                    <td>
                                        <a>Editar</a> 
                                        <a>Remover</a> 
                                    </td>
                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </main>
        </div>
    </body>
</html>
