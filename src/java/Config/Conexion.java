package Config;

import java.sql.*;

public class Conexion {
    Connection con;
    public  Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/base_datos_spa","root","#Aprendiz2024");
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection geConnection(){
        return con;
    }
}
