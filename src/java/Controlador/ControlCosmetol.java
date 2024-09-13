package Controlador;

import Modelo.Cosmetologo;
import ModeloDAO.CosmetologoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlCosmetol extends HttpServlet {
    String listar="admin/cosmetologo/listar.jsp";
    String add="admin/cosmetologo/add.jsp";
    String edit="admin/cosmetologo/edit.jsp";
    
    Cosmetologo cosmet=new Cosmetologo();
    CosmetologoDAO dao=new CosmetologoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlCosmetol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControlCosmetol at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        //listar
        if (action.equalsIgnoreCase("listar")) {
            acceso=listar;
        }
        //add
        else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if (action.equalsIgnoreCase("Agregar")) {
            String nom=request.getParameter("txtNom");
            String apell=request.getParameter("txtApell");
            String telef=request.getParameter("txtTelef");
            String especi=request.getParameter("txtEspecialidad");
            System.out.print(nom);
            System.out.print(apell);
            System.out.print(telef);
            System.out.print(especi);
            cosmet.setNom(nom);
            cosmet.setApell(apell);
            cosmet.setTelef(telef);
            cosmet.setEspeci(especi);
            dao.add(cosmet);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
