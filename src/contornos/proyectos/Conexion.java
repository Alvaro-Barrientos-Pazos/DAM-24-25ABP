package contornos.proyectos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String HOST = "localhost";
    public static final String DATABASE = "gamba";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String PORT = "3306";


    public static Connection conectar() {
        Connection con = null;

        String url = "jdbc:mysql://"+ Conexion.HOST + ":" + Conexion.PORT + "/" + Conexion.DATABASE;


        try {
            con = DriverManager.getConnection(url,Conexion.USER, Conexion.PASSWORD);
        }
        catch (SQLException e){
            System.out.println("Error al conectar con la DB.");
        }

        return con;
    }

}
