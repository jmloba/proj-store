/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author JovenLoba
 */
public class ConnectionProvider {
  
  private final String username = "root";
  private final String password = "Acoje1985**";
  private final String localhost = "jdbc:mysql://localhost:3306/store";
  public static Connection connew = null;
  
  private static ConnectionProvider  handler = null;
    // no object can be created by from any class 

  public   Connection getCon(){
      
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connew = DriverManager.getConnection(localhost, username, password);
          return connew;
      } catch (ClassNotFoundException | SQLException ex) {
          Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
          return null;
      }
      
  }    
      
    
    
}
