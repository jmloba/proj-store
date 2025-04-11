/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Database.DatabaseHandler;
import  model.User;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

import AlertMaker.AlertMaker;
import static global.GlobalMessages.display_query;

/**
 *
 * @author JovenLoba
 */
public class UserDao {
  public static  DatabaseHandler handler =  DatabaseHandler.getInstance();
  public static void save(User user){
    String query = "insert into user (name,email,mobile, address,"
            + "password,securityQuestion,answer,status) "
            + "values ('"
            + user.getName() + "','"
            + user.getEmail() + "','"
            + user.getMobileNumber() + "','"
            + user.getAddress()+ "','"
            + user.getPassword()+ "','"
            + user.getSecurityQuestion()+ "','"
            + user.getAnswer()+ "','false')";
    
    display_query(query);
    if(handler.execAction(query)){
      String message= " Insert to user success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not Insert record to user .. Failed";
      AlertMaker.AlertQuery_Error(message);   
      }        
//    DbOperations.setDataOrDelete(query, "Registered successfully!!, wait for admin approval ");
  }
  
  public static User login(String email, String password){
    User user = null;
    try{
      String query = " select * from user where email = '"+ email+ "' and password = '"+password+"'";
      ResultSet  rs = handler.execQuery(query);
      while (rs.next()){
        user = new User();
        user.setStatus(rs.getString("status"));
      }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
    return user;
    
  }
  public static User getSecurityQuestion(String email){
  User user = null;
    try{
      String query = " select securityQuestion,answer from user where email = '"+ email+ "'";
      ResultSet  rs = handler.execQuery(query);
      while (rs.next()){
        user = new User();
        user.setSecurityQuestion(rs.getString("securityQuestion"));
        user.setAnswer(rs.getString("answer"));
      }
      
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
    return user;    
  }
  
  
  public static User getUserPassword(String email){
    System.out.println("email to search "+email);
  User user = null;
    try{
      String query = " select password from user where email = '"+ email+ "'";
      System.out.println("query get passsword"+ query);
      ResultSet  rs = handler.execQuery(query);
      while (rs.next()){
        user = new User();
        user.setPassword(rs.getString("password"));
        
      }
      
    }
    catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
    return user;    
  }
  public static void updatePassword(String email, String newPassword){
    String query = "update user set password = '"+newPassword+"'  where email = '"+email+"'  ";
     if(handler.execAction(query)){
      String message= " Update user success !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did Update user";
      AlertMaker.AlertQuery_Error(message);   
    }        

  }

  
  public static void changePassword(String email,String oldPassword, String newPassword  ){
    try{
       
      String query = "select * from user  where email = '"+email+"' and password = '"+oldPassword+"'";
        ResultSet  rs = handler.execQuery(query);
      if (rs.next()){
        updatePassword(email,newPassword);
      }
      else{
      JOptionPane.showMessageDialog(null, "Old Password is wrong");
      }
    }
    catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
    
  }
  
  
  public static void updateForgotPassword(String newpassword, String email){
    System.out.println("user dao new password : "+ newpassword);
    String query = "update user set password='"+newpassword+"' where email = '"+email+"' ";
   if(handler.execAction(query)){
      String message= " New Password updated !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not update new password .. Failed";
      AlertMaker.AlertQuery_Error(message);   
      }       
//    DbOperations.setDataOrDelete(query, "Password has been updated");
    
  }
  
  
  public static void updateStatus(int id, String status){
    System.out.println("user dao update status : "+ status);
    String query = "update user set status='"+status+"' where id = "+id+" ";
 if(handler.execAction(query)){
      String message= " User status  updated !! ";
       AlertMaker.AlertQuery_Success(message);
    }else {
      String message= " Did not update user status  .. Failed";
      AlertMaker.AlertQuery_Error(message);   
      }         
    
    
//    DbOperations.setDataOrDelete(query, "status has been updated");
    
  }
  
  
 public static ArrayList getAllRcords(){
    ArrayList<User> arrayList = new ArrayList<>();
    String query = "select * from user";
    
    try{
      ResultSet  rs = handler.execQuery(query);
//      ResultSet rs = DbOperations.getData(query);
      
      while (rs.next()) {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setMobileNumber(rs.getString("mobile"));
        user.setAddress(rs.getString("address"));
        user.setSecurityQuestion(rs.getString("securityQuestion"));
        user.setAnswer(rs.getString("answer"));
        user.setStatus(rs.getString("status"));
        
        
        arrayList.add(user);
      }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return arrayList;
  }    
 public static ArrayList getAllRecords_Email(String email){
    ArrayList<User> arrayList = new ArrayList<>();
    String query = "select * from user where email like '%"+email+"%'  ";
    System.out.println("query filter search : "+ query);
    
    try{
      
      ResultSet  rs = handler.execQuery(query);
//      ResultSet rs = DbOperations.getData(query);
      
      while (rs.next()) {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        user.setMobileNumber(rs.getString("mobile"));
        user.setAddress(rs.getString("address"));
        user.setSecurityQuestion(rs.getString("securityQuestion"));
        user.setAnswer(rs.getString("answer"));
        user.setStatus(rs.getString("status"));
        
        
        arrayList.add(user);
      }
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return arrayList;
  }    
}
