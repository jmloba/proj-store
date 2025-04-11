/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_handler;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author JovenLoba
 */
public class CategoryDao {
  public static DatabaseHandler handler =  DatabaseHandler.getInstance();  
  
  
  public static void save(Category category){
    
    String mcode = category.getCode();
    String mname = category.getName();
    
    System.out.println("mcode : "+ mcode);
    System.out.println("name : "+ mname);
    
    
    String query = "insert into category (code,name) values ('"
        + category.getCode()+"','"
        + category.getName() + "')";
   System.out.println("query : "+query );
    display_query(query);
     if(handler.execAction(query)){
      String message= " Insert into category success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not insert in category user";
      AlertMaker.AlertQuery_Error(message);   
    }        
//    DbOperations.setDataOrDelete(query, "Category has been added successfully!!, wait for admin approval ");
  }
  
public static  ArrayList<Category>  getAllRecords(){
  ArrayList<Category> arrayList= new ArrayList<>();
  String query = "select * from category";
  
  try{
//    ResultSet rs = DbOperations.getData(query);
      ResultSet  rs = handler.execQuery(query);
      show_handler(handler);

    while (rs.next()){
      Category category = new Category();
      category.setId(rs.getInt("id"));
      category.setCode(rs.getString("code"));
      category.setName(rs.getString("name"));
      
      arrayList.add(category);
    }
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, ex);
    return null;
  }
  return arrayList;
}

public static void deleteCategoryRecord(String id){
  String query = "delete from category where id= '"+id+"'";
  display_query(query);
     if(handler.execAction(query)){
      String message= " Delete from category success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not delete from  category user";
      AlertMaker.AlertQuery_Error(message);   
    }     
//  DbOperations.setDataOrDelete(query, "Category REcord has been deleted");
}

}
