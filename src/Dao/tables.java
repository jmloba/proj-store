/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dao;
import AlertMaker.AlertMaker;

import Database.DatabaseHandler;
import static Database.DatabaseHandler.createtable;

import static global.GlobalMessages.show_handler;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JovenLoba
 */
public class tables {
  public static DatabaseHandler handler=  DatabaseHandler.getInstance();
  public static Statement stmt = null;
  public  static Connection connew = null;
  
  
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      create_tables();
    }

  private static void create_tables() {
//    createTable_User();
//    createTable_VariableTable();
//    createTAble_Category();
//    createTAble_Product();
//    createTAble_Product();
//    createTable_Bill();
      createTable_Bill_history();
    
      
  }
  private static void createTable_VariableTable() {
    try{          
    String TABLE_NAME= "vartable";
    
    String query="create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
      + "name varchar(250) unique not null, "
      + "type varchar(200), "
      + "value varchar (50),"
      + "status varchar(20) "
      + ")"   ;

//    createtable(TABLE_NAME,query );
   
    
//    String query_insert="insert into vartable (name,type,value,status ) values('valid_mobile_length','int','3','true')";
    String query_insert="insert into vartable (name,type,value,status ) values('valid_customer_length','int','3','true')";
      if(handler.execAction(query_insert)){
      String message= " Insert to vattable success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not Insert record to user .. Failed";
      AlertMaker.AlertQuery_Error(message);   
      }     
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
  }

  private static void createTable_User() {
    String TABLE_NAME= "user";
    
    String query="create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
      + "name varchar(250), "
      + "email varchar(50) unique , "
      + "mobile varchar(20) unique , "
      + "address varchar(250), "
      + "password varchar(200), "
      + "securityQuestion varchar(200), "
      + "answer varchar (50),"
      + "status varchar(20) "
      + ")"   ;

    String adminDetails="insert into user (name,email,mobile,address,password,"
      + "securityQuestion, answer , status) "
      + "values('admin','admin@admin.com','0999','adminaddress','admin','teacher',"
      + "'nanette','true')";
    try{          
    createtable(TABLE_NAME,query );
    if(handler.execAction(adminDetails)){
      String message= " Insert to user success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not Insert record to user .. Failed";
      AlertMaker.AlertQuery_Error(message);   
      }            
      
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
  }

  private static void createTAble_Category() {
    String TABLE_NAME= "category";

    String query="create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
            + "code varchar(20) unique not null ,"
            + "name varchar(200)not null "
            + ")"   ;

  try{          
    createtable(TABLE_NAME,query );

     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
  }
  private static void createTAble_Product() {
        String TABLE_NAME= "product";

    String query="create table "+TABLE_NAME+" (id int AUTO_INCREMENT primary key,"
            + "name varchar(200) unique not null, "
            + "category varchar(200)  ,"
            + "date_updated date ,"
            + "costprice double(8,2) not null default 0.00,"
            + "price double(8,2) not null default 0.00  "
            
            
            + ")"   ;

  try{          
      createtable(TABLE_NAME,query );
       
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
  }
  private static void createTable_Bill() {
        String TABLE_NAME= "bill";

    String query="create table "+TABLE_NAME+" (id int primary key,"
            + "name varchar(200)  not null, "
            + "mobile varchar(20)  ,"
            + "email varchar(20)  ,"
            + "total Double(10,2) not null default 0.00  ,"
            
            + "date varchar(50)  ,"
            + "createdby varchar(200)"
            + ")"   ;

  try{          
       DbOperations.createtable(TABLE_NAME,query );
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
  }

  private static void createTable_Bill_history() {
     String TABLE_NAME= "billdetails";

    String query="create table "+TABLE_NAME+" (id int primary key AUTO_INCREMENT,"
            + "bill_no int  not null, "
            + "bill_date date   not null, "
            + "product_name varchar (200) not null, "
            + "quantity int not null default 0, "
            + "price double not null default 0.00, "
            + "total double not null default 0.00, "
            + "createdby varchar(200)"
            + ")"   ;
  try{          
      createtable(TABLE_NAME,query );
       
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
  }



}
