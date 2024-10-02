package model;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;


public class DBConne {
    //private static final DRIVER ="com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/estacionamento_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
     public static void  closeConection (Connection con){
         if (con!=null){
             try {
                 con.close();
             } catch (Exception ex) {
                // Logger.getLogger(DBConnect.class.getNome()).log(Level.SEVERE, null,ex);
             }
         }
         
     }
 public static void  closeConection (Connection con, PreparedStatement stmt){
      closeConection(con);
             try {
             if (stmt!=null){
             stmt.close();
             }
             } catch (Exception ex) {
                // Logger.getLogger(DBConnect.class.getNome()).log(Level.SEVERE, null,ex);
             }
         }
          public static void  closeConection (Connection con, PreparedStatement stmt, ResultSet rs){
      closeConection(con, stmt);
             try {
             if (rs!=null){
             rs.close();
             }
             } catch (Exception ex) {
                // Logger.getLogger(DBConnect.class.getNome()).log(Level.SEVERE, null,ex);
             }
         }
     
}

