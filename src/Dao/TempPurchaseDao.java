/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import static Dao.BillDao.handler;
import static Dao.ProductDao.handler;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_handler;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bill;
import model.Product;
import model.TempPurchase;

/**
 *
 * @author JovenLoba
 */
public class TempPurchaseDao {
  public static  DatabaseHandler handler =  DatabaseHandler.getInstance();
  
  public static void save(TempPurchase tp){
   String query = "insert into temp_purchases (product_name, category, quantity,"
            + "price,total,createdby ) "
            + "values ( '"
            
            + tp.getName()  + "','"
           + tp.getCategory()  + "',"
           + tp.getQuantity() + ","
           + tp.getPrice() + ","
           + tp.getTotal() + ",'"
           + tp.getCreatedby() + "')";
    
    display_query(query);
     if(handler.execAction(query)){
      String message= " insert into bill temp_purchases !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did Update temp_purchases";
      AlertMaker.AlertQuery_Error(message);   
    }       
//    DbOperations.setDataOrDelete(query, "Bill was successfulyy saved ");
  }  
    public static ArrayList getAllRcords(String email) {
    ArrayList<TempPurchase> arrayList = new ArrayList<>();
    String query = "select * from temp_purchases where createdby = '"+email+"'";
    display_query(query);

    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//      ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
        TempPurchase tp = new TempPurchase();
        tp.setName(rs.getString("product_name"));
        tp.setCategory(rs.getString("category"));
        
        tp.setQuantity(rs.getInt("quantity"));
        tp.setPrice(rs.getDouble("price"));
        tp.setTotal(rs.getDouble("total"));
        tp.setCreatedby(rs.getString("createdby"));
        
        
        arrayList.add(tp);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return arrayList;
  }
    
 public static void delete_from_temp(String name, String category, int quantity, double price, String created_by) {
    String query = "delete from  temp_purchases where product_name = '" +  name 
            + "' and category = '"+category
            + "' and quantity = "+quantity
            +" and price = " + price 
            +" and createdby = '"+created_by+"'" ;
    
    display_query(query);
//    DbOperations.setDataOrDelete(query, "Product  been deleted successfully!!");         

    if (handler.execAction(query)) {
      String message = " Deleted from  product  -- success !! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Did notdelete from  product ";
      AlertMaker.AlertQuery_Error(message);
    }

  }    
   public static void delete_from_temp_email( String email) {
    String query = "delete from  temp_purchases where createdby = '" +  email 
            +"'" ;
    
    display_query(query);
//    DbOperations.setDataOrDelete(query, "Product  been deleted successfully!!");         

    if (handler.execAction(query)) {
      String message = " Deleted from  product  -- success !! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Did notdelete from  product ";
      AlertMaker.AlertQuery_Error(message);
    }

  }     
}
