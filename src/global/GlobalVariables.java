/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import Dao.VarTableDao;
import Database.DatabaseHandler;

import model.VarTable;

/**
 *
 * @author JovenLoba
 */
public class GlobalVariables {
  
  public static Integer windowWidth = 1378;
  public static Integer windowHeight = 778;
  public static Integer windowCategoryWidth = 700;
  public static Integer windowCategoryHeight = 450;
  
  public static Integer windowLocX = 350;
  public static Integer windowLocY = 100;
  
  public static  String emailPattern ="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
  public static  String amountPattern = "\\d+(\\.\\d{2})?";
  public static String mobilePattern = "^[0-9]*$";
  public static int valid_mobile_length = get_int_var("int","valid_mobile_length");
  public static int valid_customer_length =get_int_var("int","valid_customer_length");
  
public static  DatabaseHandler handler =  DatabaseHandler.getInstance();    

  public static Integer get_int_var(String typeof , String find_var){
    int rtn_value = 0;
    VarTable vartable = new VarTable();
    vartable =VarTableDao.get_IntValue(find_var);
    rtn_value = Integer.valueOf( vartable.getValue());
    return rtn_value;
  
  }
 
  
}
