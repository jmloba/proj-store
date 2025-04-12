/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import static Dao.BillDao.handler;
import static Dao.TempPurchaseDao.handler;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_handler;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Purchase;
import model.TempPurchase;

/**
 *
 * @author JovenLoba
 */
public class PurchaseDao {
  public static  DatabaseHandler handler =  DatabaseHandler.getInstance();
  
  public static Integer get_Ref(){
    int id = 1;
    try{
      String query = "select max(ref) from purchases";
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
  
   public static void save(Purchase tp){
   String query = "insert into purchases ("
           + "ref,product_name, category, quantity,"
            + "price,total,createdby, purchase_from , purchase_date ) "
            + "values ( "
                        + tp.getRef()  + ",'"
            + tp.getName()  + "','"
           + tp.getCategory()  + "',"
           + tp.getQuantity() + ","
           + tp.getPrice() + ","
           + tp.getTotal() + ",'"
           + tp.getCreatedby() + "','"
           + tp.getPurchase_from()+"','"
           + tp.getPurchase_date()+"'"
           + ")";
    
    display_query(query);
     if(handler.execAction(query)){
      String message= " insert into purcjase success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did no  Update insert to purchase";
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
}
