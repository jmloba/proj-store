/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import Database.Common_Var;
import java.sql.Connection;
import Database.DatabaseHandler;

/**
 *
 * @author JovenLoba
 */
public class GlobalMessages {
   static Boolean show_messages = Common_Var.showmessage;
   

  public static void show_connection(Connection connew,DatabaseHandler handler) {
//    if (show_messages){
//      System.out.println("connection" + connew);
//      String message = "handler:" + handler + "\n\n Connection : " + handler.get_connection();
//      AlertMaker.AlertMaker.showSimpleMessageAlert(message);
//    }

  }

  public static void show_handler(DatabaseHandler handler) {
    if (show_messages){
      System.out.println("from Global Variables: \n Handler :" + handler + ""
        + "\n Connection : " + handler.get_connection());
    }
  }
  
  public static  void display_query(String query) {
    if (show_messages){
    System.out.println("Query to execure :"+ query);
    }
  }
  public static  void display_parameterpassed(String params) {
    if (show_messages){
    System.out.println("\nParameter passed: :"+ params);
    }
  }
}
