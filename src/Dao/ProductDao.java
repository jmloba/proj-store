/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import AlertMaker.AlertMaker;
import Database.DatabaseHandler;
import static global.GlobalMessages.display_parameterpassed;
import static global.GlobalMessages.display_query;
import static global.GlobalMessages.show_handler;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import model.Category;
import model.Product;

/**
 *
 * @author JovenLoba
 */
public class ProductDao {

  public static DatabaseHandler handler = DatabaseHandler.getInstance();

  public static void save(Product product) {
    String query = "insert into product (name, category,costprice,price) "
            + "values ('"
            + product.getName() + "', '"
            + product.getCategory() + "', "
            + product.getCost() + ", "
            + +product.getPrice() + " ) ";
    display_query(query);
    if (handler.execAction(query)) {
      String message = " Product has been added !!! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Failed to insert to the product";
      AlertMaker.AlertQuery_Error(message);
    }
//    DbOperations.setDataOrDelete(query, "Product  been added successfully!!");
  }

  public static void update(Product product) {
    String query = "update  product set name ='" + product.getName()
            + "', category='" + product.getCategory()
            + "' , price = " + product.getPrice() + " ,costprice = " + product.getCost() + " where id = " + product.getId() + "";
    display_query(query);

    if (handler.execAction(query)) {
      String message = " Updated product name -- success !! ";
      AlertMaker.AlertQuery_Success(message);
    } else {
      String message = " Did not update product name";
      AlertMaker.AlertQuery_Error(message);
    }
//    DbOperations.setDataOrDelete(query, "Product  been updated successfully!!");         

  }

  public static void delete(int id) {
    String query = "delete from  product where id = " + id + "";
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

  public static ArrayList getAllRcords() {
    ArrayList<Product> arrayList = new ArrayList<>();
    String query = "select * from product";
    display_query(query);

    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//      ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setCategory(rs.getString("category"));
        product.setPrice(rs.getDouble("price"));
        product.setCost(rs.getDouble("costprice"));
        arrayList.add(product);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
      return null;
    }
    return arrayList;
  }

  public static ArrayList<Product> getAllRecordsByCAtegory(String category) {
    ArrayList<Product> arrayList = new ArrayList<>();
    String query = "select * from product where category = '" + category + "'";
    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//          ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
        Product product = new Product();
        product.setName(rs.getString("name"));
        arrayList.add(product);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
    }
    return arrayList;
  }

  public static ArrayList<Product> filterProductByName(String name, String category) {
    ArrayList<Product> arrayList = new ArrayList<>();

    String query = "select * from product where name like '%" + name + "%' and category = '" + category + "'";
    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);
//          ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
        Product product = new Product();
        product.setName(rs.getString("name"));
        arrayList.add(product);
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
    }
    return arrayList;
  }

  public static Product getProductByName(String name) {
    String passed_parameter = "name :'" + name + "'";
    display_parameterpassed(passed_parameter);
    Product product = new Product();

    String query = "select  * from product where name = '" + name + "' ";
    display_query(query);
    try {
      ResultSet rs = handler.execQuery(query);
      show_handler(handler);

//        ResultSet rs = DbOperations.getData(query);
      while (rs.next()) {
//          product.setName(rs.getString(2));
        product.setName(rs.getString("name"));

//          product.setPrice(rs.getDouble(4));
        product.setPrice(rs.getDouble("price"));
        product.setCategory(rs.getString("category"));

      }

    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex);
    }
    return product;

  }
}
