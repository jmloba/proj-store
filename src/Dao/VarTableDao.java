package Dao;

import AlertMaker.AlertMaker;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_connection;
import static global.GlobalMessages.show_handler;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.User;
import model.VarTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JovenLoba
 */
public class VarTableDao {

  public static DatabaseHandler handler = DatabaseHandler.getInstance();

  public static void save(VarTable vartable) {
    String query = "insert into vartable (name,type,value, status) "
            + "values ('"
            + vartable.getName() + "','"
            + vartable.getType() + "','"
            + vartable.getValue() + "','"
            + vartable.getStatus() + "','false')";

    display_query(query);
//    DbOperations.setDataOrDelete(query, "saved in VArTable");
    if (handler.execAction(query)) {
      show_connection(handler.get_connection(),handler);

      String message = " Insert to user success !! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Did not Insert record to user .. Failed";
      AlertMaker.AlertQuery_Error(message);
    }
  }

  public static ArrayList<VarTable> getAllRecords() {
    ArrayList<VarTable> arrayList = new ArrayList<>();
    String query = "select * from vartable";

    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//    ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
        VarTable vartable = new VarTable();
        vartable.setId(rs.getInt("id"));
        vartable.setName(rs.getString("name"));

        arrayList.add(vartable);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return arrayList;

  }

  public static VarTable get_IntValue(String name) {
    String query = "select *  from vartable where name = '" + name + "'";
    System.out.println("query: " + query);
    VarTable vartable = new VarTable();
    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//    ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {

        vartable.setId(rs.getInt("id"));
        vartable.setValue(rs.getString("value"));
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return vartable;
  }

  public static void deleteVarTableRecord(String id) {
    String query = "delete from vartable where id= '" + id + "'";
    display_query(query);
 if (handler.execAction(query)) {
      show_connection(handler.get_connection(),handler);

      String message = " delete from vartable to user success !! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Did not Insert record to user .. Failed";
      AlertMaker.AlertQuery_Error(message);
    }
    
  }

}
