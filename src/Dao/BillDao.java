/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import Database.DatabaseHandler;
import javax.swing.JOptionPane;
import model.Bill;
import model.Product;
import java.sql.*;
import global.GlobalMessages;


import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_handler;

import java.util.ArrayList;


/**
 *
 * @author JovenLoba
 */
public class BillDao {
  public static  DatabaseHandler handler =  DatabaseHandler.getInstance();
  public static Integer get_ID(){
    int id = 1;
    try{
      String query = "select max(id) from bill";
      ResultSet  rs = handler.execQuery(query);
      show_handler(handler);
//      ResultSet rs = DbOperations.getData(query);
      if(rs.next()){
        id = rs.getInt(1);  // getting the value of maxed id
        id = id +1;
      }
    
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
    return id;
  }
  
  public static void save(Bill bill){
   String query = "insert into bill(id,name,mobile, email,"
            + "total,date,createdby ) "
            + "values ( '"
            + bill.getId()   + "','"
            + bill.getName() + "','"
            + bill.getMobile() + "','"
            + bill.getEmail()+ "',"
            + bill.getTotal() + ",'"
            + bill.getDate()+ "','"
            + bill.getCreatedby()+ "')";
    
    display_query(query);
     if(handler.execAction(query)){
      String message= " insert into bill success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did Update user";
      AlertMaker.AlertQuery_Error(message);   
    }       
//    DbOperations.setDataOrDelete(query, "Bill was successfulyy saved ");
  }
  public static ArrayList<Bill> BillGetAllRecordsAscending(String date){
      ArrayList<Bill> arrayList = new ArrayList<>();
    String query = "select * from bill  where date like '%"+date+"%' order by date,name";
    display_query(query);
    
    try{
      ResultSet  rs = handler.execQuery(query);
      show_handler(handler);
//      ResultSet rs = DbOperations.getData(query);
      
      while (rs.next()) {
        Bill bill = new Bill();
        bill.setId(rs.getInt("id"));
        bill.setName(rs.getString("name"));
        bill.setMobile(rs.getString("mobile"));
        bill.setEmail(rs.getString("email"));
        bill.setTotal(rs.getDouble("total"));
        bill.setDate(rs.getString("date"));
        
        arrayList.add(bill);
      }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
      
      return null;
    }
    return arrayList;
  }
  
    public static ArrayList<Bill> BillGetAllRecordsDescending(String date){
      ArrayList<Bill> arrayList = new ArrayList<>();
    String query = "select * from bill  where date like '%"+date+"%' order by date,name desc";
    display_query(query);
    
    try{
      ResultSet  rs = handler.execQuery(query);
      show_handler(handler);
      
//      ResultSet rs = DbOperations.getData(query);
      
      while (rs.next()) {
        Bill bill = new Bill();
        bill.setId(rs.getInt("id"));
        bill.setName(rs.getString("name"));
        bill.setMobile(rs.getString("mobile"));
        bill.setEmail(rs.getString("email"));
        bill.setTotal(rs.getDouble("total"));
        bill.setDate(rs.getString("date"));
        
        arrayList.add(bill);
      }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
      
      return null;
    }
    return arrayList;
  }
}
