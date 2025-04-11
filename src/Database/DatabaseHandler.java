/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Dao.ConnectionProvider;
import Dao.DbOperations;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import global.GlobalMessages;
import static global.GlobalMessages.show_connection;


/**
 *
 * @author JovenLoba
 */
public final class DatabaseHandler {

  private static DatabaseHandler handler = null;
  public static Connection connew = null;

  private final String username = "root";
  private final String password = "Acoje1985**";
  private final String localhost = "jdbc:mysql://localhost:3306/store";
  public static Statement stmt = null;

  private DatabaseHandler() {
System.out.println("create connetion");    
    createConnection();
    System.out.println("connection created");
    System.out.println("handler :"+handler);
    System.out.println("creating tables");
    setup_tables();
  }

  public static DatabaseHandler getInstance() {
    if (handler == null) {
      handler = new DatabaseHandler();
    }
    return handler;
  }

  void createConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connew = DriverManager.getConnection(localhost, username, password);
      Common_Var.connew = connew;
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "cant load database", "database error", JOptionPane.ERROR_MESSAGE);
      ex.printStackTrace();
      System.exit(0);
    }
  }

  public Connection get_connection() {
    return connew;
  }

  public ResultSet execQuery(String query) {
    ResultSet result;
    try {
      stmt = connew.createStatement();
      result = stmt.executeQuery(query);
      show_connection(connew,handler);
    } catch (SQLException ex) {
//      jOptionPane.showMessageDialog(null,"Error" + ex.getMessage(),"Error Occured", JOptionPane.ERROR_MESSAGE);
      System.out.println("Exception at execquery : dataHandler" + ex.getLocalizedMessage());
      return null;
    } finally {
    }
    return result;
  }

  public boolean execAction(String query) {
    Boolean show_messages = Common_Var.showmessage;
    if (show_messages){
    System.out.println("Database handler : handler" + handler);
    System.out.println("Query: " + query);
    }
    try {
      stmt = connew.createStatement();
      stmt.execute(query);
      System.out.println("execAction connew : " + connew);

      return true;
    } catch (SQLException ex) {
//      jOptionPane.showMessageDialog(null,"Error" + ex.getMessage(),"Error Occured", JOptionPane.ERROR_MESSAGE);
      System.out.println("Exception at execquery : dataHandler" + ex.getLocalizedMessage());
    }
    return false;
  }

  private void setup_tables() {
//    setup_user();
//    setup_vartable();
//  check_database();
    
  }
 private static boolean doesTableExist(Connection connection, String tableName) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        try (ResultSet resultSet = metaData.getTables(null, "store", tableName, new String[] {"TABLE"})) {
            return resultSet.next();
        }
    }
 
public static void createtable(String tablename, String query){
//    ConnectionProvider connprov = new ConnectionProvider();
//    Connection conn  = connprov.getCon();
    global.GlobalMessages.show_connection(connew,handler);
    
    try {
      Statement stmt = connew.createStatement();
      stmt.execute(query);      
//      connew.close();    
    } catch (SQLException ex) {
            Logger.getLogger(DbOperations.class.getName()).log(Level.SEVERE, null, ex);
    }
        
  
  }   
  private void setup_user() {
     String TABLE_NAME= "user";
    try {
//        if (doesTableExist(connew, TABLE_NAME)) {
//                System.out.println("Table " + TABLE_NAME + " exists.");
//       } else {
//                System.out.println("Table " + TABLE_NAME + " does not exist.");
//       }


      
      stmt = connew.createStatement();
      DatabaseMetaData dbm = connew.getMetaData();
      ResultSet tables = dbm.getTables(null, "store", TABLE_NAME.toUpperCase() , null);
//      if( tables.next()){
//        System.out.println(" Table : "+ TABLE_NAME+" ....already exists...");
//                
//      }else{
////        create the table here
      stmt.execute("create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
      + "name varchar(250), "
      + "email varchar(50) unique , "
      + "mobile varchar(20) unique , "
      + "address varchar(250), "
      + "password varchar(200), "
      + "securityQuestion varchar(200), "
      + "answer varchar (50),"
      + "status varchar(20) "
      + ")"  );
//      }


      
      
//      }



    } catch (SQLException ex) {
       System.err.println(ex.getMessage()+"   .. setup database");
    } finally{
    }
  }

  private void check_database() {
    try{
    DatabaseMetaData databaseMetaData = connew.getMetaData();
    ResultSet resultSet = databaseMetaData.getTables(null, null,"store", new String[] {"TABLE"});

    while (resultSet.next()) {
        String name = resultSet.getString("TABLE_NAME");
        String schema = resultSet.getString("TABLE_SCHEM");
        System.out.println(name + " on schema " + schema);
    }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
  }

//  private void setup_vartable() {
//   String TABLE_NAME= "vartable";
//    try {
//      stmt = connew.createStatement();
//      DatabaseMetaData dbm = connew.getMetaData();
//      ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase() , null);
//      if( tables.next()){
//        System.out.println(" Table : "+ TABLE_NAME+" ....already exists...");
//                
//      }else{
////        create the table here
//      stmt.execute("create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
//      + "name varchar(250) unique not null, "
//      + "type varchar(200), "
//      + "value varchar (50),"
//      + "status varchar(20) "
//      + ")"   );
//      }
//    } catch (SQLException ex) {
//       System.err.println(ex.getMessage()+"   .. setup database");
//    } finally{
//    }
//  }

}
