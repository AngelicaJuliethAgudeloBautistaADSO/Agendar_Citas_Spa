package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_cosmetologo;
import Modelo.Cosmetologo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CosmetologoDAO implements CRUD_cosmetologo{

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cosmetologo cosmet=new Cosmetologo();

    public CosmetologoDAO() {
    }
    
    @Override
    public List listar() {
        ArrayList<Cosmetologo>list=new ArrayList<>();
        String sql="select * from tb_cosmetolo";
        try {
            con=cn.geConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
            Cosmetologo cosm=new Cosmetologo();
            cosm.setId(rs.getInt("id"));
            cosm.setNom(rs.getString("nombre"));
            cosm.setApell(rs.getString("apellido"));
            cosm.setTelef(rs.getString("telefono"));
            cosm.setEspeci(rs.getString("especialidad"));
            list.add(cosm);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Cosmetologo list(int id) {
        String sql="SELECT * FROM `tb_cosmetolo` WHERE id =" + id;
        try {
            con=cn.geConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {            
            cosmet.setId(rs.getInt("id"));
            cosmet.setNom(rs.getString("nombre"));
            cosmet.setApell(rs.getString("apellido"));
            cosmet.setTelef(rs.getString("telefono"));
            cosmet.setEspeci(rs.getString("especialidad"));
            }
        } catch (Exception e) {
        }
        return cosmet;
    }

    @Override
    public boolean add(Cosmetologo cos) {
        String sql="insert into tb_cosmetolo (nombre, apellido, telefono, especialidad)values('"+cos.getNom()+"','"+cos.getApell()+"','"+cos.getTelef()+"','"+cos.getEspeci()+"');";
        try {
            con=cn.geConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    @Override
    public boolean edit(Cosmetologo cos) {
        String sql="update tb_cosmetolo set nombre='"+cos.getNom()+"',apellido='"+cos.getApell()+"',telefono='"+cos.getTelef()+"',especialidad='"+cos.getEspeci()+"'where id="+cos.getId();
        try {
            con=cn.geConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="DELETE FROM tb_cosmetolo WHERE id="+id;
        try {
            con=cn.geConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
