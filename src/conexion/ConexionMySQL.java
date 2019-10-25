
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    // Incorporamos la libreria MySQL
    private static String driver = "com.mysql.jdbc.Driver";
    // Nombre de la Base de datos
    private static String database = "ceduc_almacen";
    // Servidor
    private static String hostname = "192.168.1.250";
    // Puerto
    private static String port = "3306";
    // Usuario
    private static String username = "alumno";
    // URL de conexion a la Base de datos
    private static String conectionURL;
    // Conector
    public static Connection conn;
    
    
    public ConexionMySQL() {
        this.conectionURL = "jdbc:mysql://"; 
        this.conectionURL += hostname + ":" + port + "/" + database;
        this.getconnection();
    }
    
    public static Connection getconnection() {
        try {
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(conectionURL);
            } catch(SQLException ex) {
                System.out.println("Error al crear conector: " + ex.getMessage());
            }
        } catch(ClassNotFoundException ex) {
            
        }
        return conn;
    }  
}
