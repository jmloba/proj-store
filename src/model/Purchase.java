/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JovenLoba
 */
public class Purchase {
      private int id;
      private int ref;
  private String name;
  private String category;
  
  private Integer quantity;
  private Double price;
  private Double total;
  private String createdby;
  private String purchase_from;
  private String purchase_date;

  public int getRef() {
    return ref;
  }

  public void setRef(int ref) {
    this.ref = ref;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public String getPurchase_from() {
    return purchase_from;
  }

  public void setPurchase_from(String purchase_from) {
    this.purchase_from = purchase_from;
  }

  public String getPurchase_date() {
    return purchase_date;
  }

  public void setPurchase_date(String purchase_date) {
    this.purchase_date = purchase_date;
  }

}
