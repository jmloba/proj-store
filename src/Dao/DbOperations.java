/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Database.DatabaseHandler;
import static Database.DatabaseHandler.connew;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
        
public class DbOperations {
  DatabaseHandler handler =  DatabaseHandler.getInstance();
  
  public static void setDataOrDelete(String Query, String message){
        ConnectionProvider connprov = new ConnectionProvider();
        Connection conn  = connprov.getCon();
        display_Connection(conn);
        
        try {
          Statement st = conn.createStatement();
          st.executeUpdate(Query);
          if (!message.equals("")){
//                JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);
            String html_message =
           "<html><b style=\"color:Blue\"; > Data has been updated !</b></html>"   ;  
            ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
            JOptionPane.showMessageDialog(null, message,"Message",JOptionPane.INFORMATION_MESSAGE,icon);
          }
        } catch (SQLException ex) {
            Logger.getLogger(DbOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
  
  public static ResultSet getData(String query){
    
        ConnectionProvider connprov = new ConnectionProvider();
        Connection conn  = connprov.getCon();
        display_Connection(conn);
    try{    
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
        
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);    }
      return null;

  }  
  
  public static void createtable(String tablename, String query){
//    ConnectionProvider connprov = new ConnectionProvider();
//    Connection conn  = connprov.getCon();
//    display_Connection(conn);
  
    try {
      Statement stmt = connew.createStatement();
      stmt.execute(query);      
      connew.close();    
    } catch (SQLException ex) {
            Logger.getLogger(DbOperations.class.getName()).log(Level.SEVERE, null, ex);
    }
        
  
  }  

  private static void display_Connection(Connection conn) {
    System.out.println("DBOperations : Connection : "+ conn);
    
  }
}
