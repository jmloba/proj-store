/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package store;

import Dao.BillDao;
import Dao.BillDetailDao;
import Dao.CategoryDao;
import Dao.ProductDao;
import Dao.TempPurchaseDao;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import global.GlobalVariables;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.BillDetails;
import model.Product;
import model.TempPurchase;

/**
 *
 * @author JovenLoba
 */
public class TempPurchaseEntry extends javax.swing.JFrame {
  public static String user_Email = null;
  
  public int billId = 1;
  public  double grandTotal =0.0;
  public double productPrice =0.0;
  public double totalPrice =0.0;
  public int quantity =0;
  public int valid_mobile_length = GlobalVariables.valid_mobile_length;
  public int valid_custname_length = GlobalVariables.valid_customer_length;
  
  
  /**
   * Creates new form PlaceOrder
   */
  public TempPurchaseEntry() {
    initComponents();
        
    frameSizeLocation();
    fill_combo();
    initialize_Inputs();
  }
    public TempPurchaseEntry(String email) {
    System.out.println("passed :"+ email); 
   initComponents();
   frameSizeLocation();
   fill_combo();
   user_Email= email;
   myEmail.setText(email);
   
   initialize_Inputs();
  
  }
 private void initialize_Inputs(){
  txtProductName.setEditable(false);
  txtPrice.setEditable(false);
  txtTotal.setEditable(false);
  txtGrandTotal.setEditable(false);
  btnAddCart.setEnabled(false);
  btn_Generate.setEnabled(false);
  jSpinner1.setEnabled(false);
  btn_SavePurchase.setEnabled(false);
  
  }
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    cbCategory = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel9 = new javax.swing.JLabel();
    txtSearch = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    jLabel10 = new javax.swing.JLabel();
    txtProductName = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    txtPrice = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    txtTotal = new javax.swing.JTextField();
    btnAddCart = new javax.swing.JButton();
    btnClear1 = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    jLabel14 = new javax.swing.JLabel();
    txtGrandTotal = new javax.swing.JTextField();
    btn_Generate = new javax.swing.JButton();
    jSpinner1 = new javax.swing.JSpinner();
    btn_SavePurchase = new javax.swing.JButton();
    myEmail = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);
    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        formComponentShown(evt);
      }
    });
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
    jButton1.setText("Exit");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 130, 50));

    jPanel2.setBackground(new java.awt.Color(238, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel8.setText("Category");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

    cbCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    cbCategory.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbCategoryActionPerformed(evt);
      }
    });
    jPanel2.add(cbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

    jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Name"
      }
    ));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 380, 178));

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel9.setText("Product Name");
    jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

    txtSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtSearchKeyReleased(evt);
      }
    });
    jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 320, -1));

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 570, 320));

    jPanel3.setBackground(new java.awt.Color(238, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel10.setText("Product Name");
    jLabel10.setPreferredSize(new java.awt.Dimension(50, 20));
    jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 30));

    txtProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtProductName.setPreferredSize(new java.awt.Dimension(70, 24));
    jPanel3.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 249, 30));

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel11.setText("Price");
    jLabel11.setPreferredSize(new java.awt.Dimension(50, 20));
    jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, 30));

    txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtPrice.setPreferredSize(new java.awt.Dimension(70, 24));
    txtPrice.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPriceActionPerformed(evt);
      }
    });
    txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPriceKeyTyped(evt);
      }
    });
    jPanel3.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 244, 30));

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel12.setText("Quantity");
    jLabel12.setPreferredSize(new java.awt.Dimension(50, 20));
    jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 30));

    jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel13.setText("Total");
    jLabel13.setPreferredSize(new java.awt.Dimension(50, 20));
    jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 130, 30));

    txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtTotal.setPreferredSize(new java.awt.Dimension(70, 24));
    jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 244, 30));

    btnAddCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnAddCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
    btnAddCart.setText("Add Cart");
    btnAddCart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddCartActionPerformed(evt);
      }
    });
    jPanel3.add(btnAddCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 122, 30));

    btnClear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
    btnClear1.setText("Clear");
    btnClear1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnClear1ActionPerformed(evt);
      }
    });
    jPanel3.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 122, 30));

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Name", "Category", "Quantity", "Price", "Total", "Createdby"
      }
    ));
    jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable2MouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(jTable2);

    jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 600, 220));

    jLabel14.setText("Grand Total");
    jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

    txtGrandTotal.setForeground(new java.awt.Color(0, 0, 255));
    txtGrandTotal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtGrandTotalActionPerformed(evt);
      }
    });
    jPanel3.add(txtGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 145, 30));

    btn_Generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
    btn_Generate.setText("Generate Bill and Print");
    btn_Generate.addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        btn_GenerateComponentShown(evt);
      }
    });
    btn_Generate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_GenerateActionPerformed(evt);
      }
    });
    jPanel3.add(btn_Generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 250, -1));

    jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        jSpinner1StateChanged(evt);
      }
    });
    jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jSpinner1MouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        jSpinner1MousePressed(evt);
      }
    });
    jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, -1));

    btn_SavePurchase.setText("close and save");
    btn_SavePurchase.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_SavePurchaseActionPerformed(evt);
      }
    });
    jPanel3.add(btn_SavePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 190, 40));

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 79, 700, 630));

    myEmail.setForeground(new java.awt.Color(255, 255, 0));
    getContentPane().add(myEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 300, 40));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/storeHome.png"))); // NOI18N
    jLabel1.setText("Place Order");
    jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        jLabel1ComponentShown(evt);
      }
    });
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
    // TODO add your handling code here:
    String category = (String) cbCategory.getSelectedItem();
    productNameByCategory(category);
    clear_inputs();

  }//GEN-LAST:event_cbCategoryActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    txtPrice.setEnabled(true);
    txtPrice.setEditable(true);
    
    int index = jTable1.getSelectedRow();
    TableModel model  = jTable1.getModel();
    String productName = model.getValueAt(index, 0).toString();
    System.out.println("product name "+ productName);

    Product productObj = ProductDao.getProductByName(productName);
    txtProductName.setText(productObj.getName()) ;
    txtPrice.setText(productObj.getPrice().toString());
    jSpinner1.setValue(1);
    jSpinner1.setEnabled(true);
    get_totals(productObj.getPrice(), (Integer) jSpinner1.getValue());
    btnAddCart.setEnabled(true);

  }//GEN-LAST:event_jTable1MouseClicked

  private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
    // TODO add your handling code here:
    String name =txtSearch.getText();
    String category =(String )cbCategory.getSelectedItem();
    filterProductName(name, category);
  }//GEN-LAST:event_txtSearchKeyReleased

  private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
    // TODO add your handling code here:
    String prodname = txtProductName.getText();
    Double price = Double.valueOf(txtPrice.getText());
    Integer quantity = (Integer)jSpinner1.getValue();
    Double amount = Double.valueOf(txtTotal.getText());
    String category = (String )cbCategory.getSelectedItem();
    System.out.println("button to add user_Email :"+ user_Email);
    String createdby = user_Email;
    DefaultTableModel dtm =  (DefaultTableModel) jTable2.getModel();

    dtm.addRow(new Object[]{prodname,category,quantity,price,amount,createdby});
    grandTotal += amount;
    txtGrandTotal.setText( String.valueOf(grandTotal)   );
    clear_inputs();
    validateFields();
    
//    Save to table
    save_to_temp(prodname,category,quantity,price,amount,createdby);

  }//GEN-LAST:event_btnAddCartActionPerformed

  private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
    clear_inputs();
  }//GEN-LAST:event_btnClear1ActionPerformed

  private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    // TODO add your handling code here:
    //    delete record
    int index  = jTable2.getSelectedRow();
    int a = JOptionPane.showConfirmDialog(null, "Do you want t odelete ?","Select", JOptionPane.YES_NO_OPTION );
    if (a==0){
      TableModel model = jTable2.getModel();
      // get the value of total
      
      
      
      
      String name = String.valueOf(model.getValueAt(index, 0).toString());
      String category = String.valueOf(model.getValueAt(index, 1).toString());
      int quantity = Integer.valueOf(model.getValueAt(index, 2).toString());
      Double price = Double.valueOf(model.getValueAt(index, 3).toString());
      
      Double total = Double.valueOf(model.getValueAt(index, 4).toString());
      
      String created_by = user_Email;
     
      
      TempPurchaseDao.delete_from_temp(name, category, quantity,price,created_by);
      
      
      
      grandTotal-= total;

      txtGrandTotal.setText(String.valueOf(grandTotal));
      
      
      
      ((DefaultTableModel) jTable2.getModel()).removeRow(index);
    }
  }//GEN-LAST:event_jTable2MouseClicked

  private void txtGrandTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrandTotalActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtGrandTotalActionPerformed

  private void btn_GenerateComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn_GenerateComponentShown

  }//GEN-LAST:event_btn_GenerateComponentShown

  private void btn_GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerateActionPerformed
//   generate_bill();
  }//GEN-LAST:event_btn_GenerateActionPerformed

  private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
    System.out.println("mouse clicked, value of spinner : "+ jSpinner1.getValue());
    if (jSpinner1.getValue().equals(0)){
      jSpinner1.setValue(1);
    }
    get_totals(Double.valueOf(txtPrice.getText()), (Integer) jSpinner1.getValue());

  }//GEN-LAST:event_jSpinner1StateChanged

  private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked

  }//GEN-LAST:event_jSpinner1MouseClicked

  private void jSpinner1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MousePressed

  }//GEN-LAST:event_jSpinner1MousePressed

  private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
 ArrayList<model.Category> list = CategoryDao.getAllRecords();
    Iterator<model.Category> itr =  list.iterator();
    while (itr.hasNext()){
     model.Category categoryObj = itr.next();
     cbCategory.addItem(categoryObj.getName());

    }
    String category = (String ) cbCategory.getSelectedItem();
    productNameByCategory(category);
    
    fill_Table();
  }//GEN-LAST:event_formComponentShown

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  setVisible(false);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
fill_category();
fill_Table();
  }//GEN-LAST:event_jLabel1ComponentShown

  private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPriceActionPerformed

  private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
  char c = evt.getKeyChar();
    if ( !(Character.isDigit(c)) && c !=KeyEvent.VK_PERIOD){
      getToolkit().beep();
      evt.consume(); 
    }else if(c==KeyEvent.VK_PERIOD && txtPrice.getText().indexOf(".")>-1 ){
      getToolkit().beep();
      evt.consume(); 
    } else if (txtPrice.getText().length()>=10){
      getToolkit().beep();
      evt.consume(); 
    } if(txtPrice.getText().length()==9){
      txtPrice.setText(txtPrice.getText().substring(1));
    }
    
    Double  Amount = 0.0;
    int quantity  = (Integer) jSpinner1.getValue();
    Double price =   Double.valueOf(txtPrice.getText());
    Double amt = quantity * price ;
    txtTotal.setText(String.valueOf(amt));
    
    
    
    
    
    
  }//GEN-LAST:event_txtPriceKeyTyped

  private void btn_SavePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SavePurchaseActionPerformed
    // TODO add your handling code here:
    closeAndSave();
  }//GEN-LAST:event_btn_SavePurchaseActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(TempPurchaseEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TempPurchaseEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TempPurchaseEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TempPurchaseEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TempPurchaseEntry(null).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAddCart;
  private javax.swing.JButton btnClear1;
  private javax.swing.JButton btn_Generate;
  private javax.swing.JButton btn_SavePurchase;
  private javax.swing.JComboBox<String> cbCategory;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JSpinner jSpinner1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JLabel myEmail;
  private javax.swing.JTextField txtGrandTotal;
  private javax.swing.JTextField txtPrice;
  private javax.swing.JTextField txtProductName;
  private javax.swing.JTextField txtSearch;
  private javax.swing.JTextField txtTotal;
  // End of variables declaration//GEN-END:variables

   private void fill_combo() {
    fill_category();
    
  }
   public void filterProductName(String name,String category){
      DefaultTableModel dtm =  (DefaultTableModel) jTable1.getModel();
//      remove all reords from table
      dtm.setRowCount(0);
      
      ArrayList<Product> productlist = ProductDao.filterProductByName(name, category);
      Iterator<Product> itr = productlist.iterator();
      while(itr.hasNext()){
        Product productObj = itr.next();
        dtm.addRow(new Object[]{productObj.getName()});
      }
    }   
private void fill_category() {
    ArrayList<model.Category> list = CategoryDao.getAllRecords();
    Iterator<model.Category> itr =  list.iterator();
    while (itr.hasNext()){
     model.Category categoryObj = itr.next();
     cbCategory.addItem(categoryObj.getName());

    }
    String category = (String ) cbCategory.getSelectedItem();
    productNameByCategory(category);
  }  
private void fill_Table() {
     grandTotal = 0.0;
    DefaultTableModel  dtm = (DefaultTableModel) jTable2.getModel();
    dtm.setRowCount(0);
    // get all records rom products
    ArrayList<TempPurchase> list = TempPurchaseDao.getAllRcords(user_Email);
    
    Iterator<TempPurchase> itr = list.iterator();
    while (itr.hasNext()){
      TempPurchase tp_Obj = itr.next();
      dtm.addRow(new Object[]{     
        tp_Obj.getName(),
        tp_Obj.getCategory(),
        tp_Obj.getQuantity(),
        tp_Obj.getPrice(),
        tp_Obj.getTotal(),
        tp_Obj.getCreatedby()
      });
      grandTotal += Double.valueOf(tp_Obj.getTotal().toString());
      txtGrandTotal.setText(String.valueOf(grandTotal));
      if (!(grandTotal==0)){
        btn_SavePurchase.setEnabled(true);
      }else if (grandTotal == 0){
        btn_SavePurchase.setEnabled(false);
      }
      
      
    
    }
  }
  public void productNameByCategory(String category){
      DefaultTableModel dtm =  (DefaultTableModel) jTable1.getModel();
//      remove all reords from table
      dtm.setRowCount(0);
      ArrayList<Product> productlist = ProductDao.getAllRecordsByCAtegory(category);
      Iterator<Product> itr = productlist.iterator();
      while(itr.hasNext()){
        Product productObj = itr.next();
        dtm.addRow(new Object[]{productObj.getName()});
      }
    }
  public void get_totals(double price, int quantity){
  if (quantity== 0 || price == 0.00){
  }else{
  Double mtotal = price * quantity;
  System.out.println("total is now :"+mtotal);
 txtTotal.setText(mtotal.toString() );
  }

}
 private void frameSizeLocation() {
    int  height =  global.GlobalVariables.windowHeight;
    int  width =  global.GlobalVariables.windowWidth;
    int x = global.GlobalVariables.windowLocX;
    int y = global.GlobalVariables.windowLocY;
//    setSize(width, height);
//    setLocation(200,100);
    setBounds(x,y,width,height);
    
   }
    public void validateFields(){
      System.out.println("validate fields......");
      
      if (!(grandTotal==0) ){
        btn_SavePurchase.setEnabled(true);
        
      }
//      String customerName = txtCustomerName.getText();
//      String customerMobile = txtMobile.getText();
//      String customerEmail =  txtEmail.getText();
//      
//      if(   (!customerEmail.equals("")) 
//         && (!customerMobile.equals(""))    
//         && (customerMobile.length()>= valid_mobile_length)    
//         && (customerName.length()>= valid_custname_length)     
//         &&  (customerMobile.matches(GlobalVariables.mobilePattern))
//         &&  (customerEmail.matches(GlobalVariables.emailPattern))     
//         &&   (grandTotal>0  )
//         ){       
//        
//        btn_Generate.setEnabled(true);
//      
//      }else{
//         btn_Generate.setEnabled(false);
//      }
              
    }
        private void clear_inputs() {
    txtProductName.setText("");
    txtPrice.setText("");
    txtTotal.setText("");
//    jSpinner1.setValue(0);
    jSpinner1.setEnabled(false);
    btnAddCart.setEnabled(false);
    
  }



  private String reformatdate(String todaydate) {
  
    String str = todaydate.substring(6, 10)+todaydate.substring(3, 5)+todaydate.substring(0, 2);
    System.out.println("date : todaydate: " + todaydate);
    System.out.println("substring :"+ str);
    return str;
  }

  private void generate_bill() {
//        String customerName = txtCustomerName.getText();
//    String customerMobile  = txtMobile.getText();
//    String customerEmail = txtEmail.getText();
//
//    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
//    Date date = new Date();
//    String todaydate = dFormat.format(date);
//    String total = txtGrandTotal.getText();
//    String createdby = user_Email;

//    Bill bill = new Bill();
//    bill.setId(billId);
//    bill.setName(customerName);
//    bill.setMobile(customerMobile);
//    bill.setEmail(customerEmail);
//    bill.setTotal(Double.valueOf(total));
//    bill.setCreatedby(createdby);
//
//    bill.setDate(todaydate);
//    BillDao.save(bill);
//
//    /*
//    Create the document
//    */
//    String path = "C:\\Users\\JovenLoba\\Desktop\\outputfiles\\report_"         ;
//    com.lowagie.text.Document doc = new com.lowagie.text.Document ();
//    try{
//      PdfWriter.getInstance(doc, new FileOutputStream(path + billId+".pdf"));
//      doc.open();
//      Paragraph cafeName = new Paragraph(" Cafe Management ");
//
//      doc.add(cafeName);
//
//      Paragraph starline = new Paragraph( "**************");
//      doc.add(starline);
//
//      Paragraph parag3 = new Paragraph ("\t Bill id : " + billId + "\n"
//        + "Customer Name "+customerName+"\n"
//        + "Customer Email " +customerEmail+"\n\n"
//        + "Total Amount Paid :" + txtGrandTotal.getText()+ "");
//      doc.add(parag3);
//      PdfPTable tabl = new PdfPTable(4);
//      tabl.addCell("Name");
//      tabl.addCell("Price");
//      tabl.addCell("Quantity");
//      tabl.addCell("Total");
//      for (int i=0; i< jTable2.getRowCount(); i++){
//        String m_name = jTable2.getValueAt(i, 0).toString();
//        String m_price = jTable2.getValueAt(i, 1).toString();
//        String m_quantity = jTable2.getValueAt(i, 2).toString();
//        String m_total = jTable2.getValueAt(i, 3).toString();
//        
//        tabl.addCell(m_name);
//        tabl.addCell(m_price);
//        tabl.addCell(m_quantity);
//        tabl.addCell(m_total);
//        
//        save_record_to_bill_Details(billId,todaydate,m_name,Integer.valueOf(m_quantity), Double.valueOf(m_price), Double.valueOf(m_total),createdby );
//      }
//      doc.add(tabl);
//      doc.add(starline);
//      Paragraph thanku = new Paragraph("Thnak@@@");
//      doc.add(thanku);
//      // open pdf
//      OpenPdf.OpenPdf.openById(path, billId);
//    }catch(Exception ex){
//      JOptionPane.showMessageDialog(null, ex);
//    }
//    doc.close();
//    setVisible(false);
//    new TempPurchaseEntry().setVisible(true);

  }

  
    private void save_record_to_bill_Details(
          int billId, String todaydate, String m_name, 
          int quantity, double price, double total, String createdby
          ) {
    String mdate = reformatdate(todaydate);
  BillDetails bd = new BillDetails();
  bd.setBill_no(billId);
  bd.setDate(mdate);
  bd.setName(m_name);
  bd.setQuantity(quantity);
  bd.setPrice(price);
  bd.setTotal(total);
  bd.setCreatedby(createdby);
  
       BillDetailDao.save(bd);
    
  }

  private void save_to_temp(String prodname, String category, Integer quantity, Double price, Double amount, String createdby) {
    TempPurchase tp = new TempPurchase();
    tp.setName(prodname);
    tp.setCategory(category);
    tp.setQuantity(quantity);
    tp.setPrice(price);
    tp.setTotal(amount);
    tp.setCreatedby(createdby);
    TempPurchaseDao.save(tp);
    
            
            
            }

  private void closeAndSave() {
    ArrayList<TempPurchase> entrylist = TempPurchaseDao.getAllRcords(user_Email);
   
    new SavePurchase(entrylist,user_Email).setVisible(true)  ;
    fill_Table();
  }
  
}
