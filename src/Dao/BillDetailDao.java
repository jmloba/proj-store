/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import static Dao.BillDao.handler;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_query;
import model.Bill;
import model.BillDetails;

/**
 *
 * @author JovenLoba
 */
public class BillDetailDao {
  public static  DatabaseHandler handler =  DatabaseHandler.getInstance();
  public static void save(BillDetails bd){
   String query = "insert into billdetails("
           + " bill_no, bill_date, product_name, "
           + "quantity,  price,total, createdby)"
           
            + " values ( '"
            + bd.getBill_no()+ "','"
            + bd.getDate()  + "','"
            + bd.getName()  + "',"
            + bd.getQuantity()+ ","
            + bd.getPrice()+ ","
           + bd.getTotal() + ",'"
            + bd.getCreatedby()+ "')";
    
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
}
