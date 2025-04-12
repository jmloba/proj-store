/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package store;

import Dao.CategoryDao;
import Dao.ProductDao;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import model.Product;

/**
 *
 * @author JovenLoba
 */
public class JDialogNewProduct extends javax.swing.JDialog {

  /**
   * Creates new form jDialogNewProduct
   */
  public JDialogNewProduct(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    frameSizeLocation();
  }
   private void frameSizeLocation() {
    int  height =  global.GlobalVariables.windowCategoryHeight;
    int  width =  global.GlobalVariables.windowCategoryWidth;
    int x = 600;
    int y = 250;
//    setSize(width, height);
//    setLocation(200,100);
    setBounds(x,y,width,height);

  } 
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTextField1 = new javax.swing.JTextField();
    btn_Cancel = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    cbCategory = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtCost = new javax.swing.JTextField();
    txtPrice = new javax.swing.JTextField();
    btn_Save = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    btnExit = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        formComponentShown(evt);
      }
    });
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTextField1.setText("jTextField1");
    getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 444, -1));

    btn_Cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel2.setText("Name");
    btn_Cancel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 55, 67, -1));

    txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btn_Cancel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 52, 262, -1));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setText("Category");
    btn_Cancel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 100, -1, -1));

    cbCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btn_Cancel.add(cbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 97, 263, -1));

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setText("Cost Price");
    btn_Cancel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 145, 71, -1));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel5.setText("Price");
    btn_Cancel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 184, -1, -1));

    txtCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtCost.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtCostKeyTyped(evt);
      }
    });
    btn_Cancel.add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 142, 238, -1));

    txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPriceKeyTyped(evt);
      }
    });
    btn_Cancel.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 181, 238, -1));

    btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
    btn_Save.setText("Save");
    btn_Save.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_SaveActionPerformed(evt);
      }
    });
    btn_Cancel.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 226, -1, -1));

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
    jButton2.setText("Cancel");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    btn_Cancel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 226, -1, -1));

    getContentPane().add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 470, 300));

    btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
    btnExit.setText("Exit");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });
    getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_orange_700x450.png"))); // NOI18N
    jLabel1.setText("jLabel1");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostKeyTyped
    char c = evt.getKeyChar();
    if ( !(Character.isDigit(c)) && c !=KeyEvent.VK_PERIOD){
      getToolkit().beep();
      evt.consume();
    }else if(c==KeyEvent.VK_PERIOD && txtCost.getText().indexOf(".")>-1 ){
      getToolkit().beep();
      evt.consume();
    } else if (txtCost.getText().length()>=10){
      getToolkit().beep();
      evt.consume();
    } if(txtCost.getText().length()==9){
      txtCost.setText(txtCost.getText().substring(1));
    }
  }//GEN-LAST:event_txtCostKeyTyped

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
  }//GEN-LAST:event_txtPriceKeyTyped

  private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
    save_record();
  }//GEN-LAST:event_btn_SaveActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    clear_inputs();    // TODO add your handling code here:
  }//GEN-LAST:event_jButton2ActionPerformed

  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    setVisible(false);
  }//GEN-LAST:event_btnExitActionPerformed

  private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    fill_category();
  }//GEN-LAST:event_formComponentShown

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
      java.util.logging.Logger.getLogger(JDialogNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(JDialogNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(JDialogNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(JDialogNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        JDialogNewProduct dialog = new JDialogNewProduct(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnExit;
  private javax.swing.JPanel btn_Cancel;
  private javax.swing.JButton btn_Save;
  private javax.swing.JComboBox<String> cbCategory;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField txtCost;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtPrice;
  // End of variables declaration//GEN-END:variables

 private void save_record() {
   String name = txtName.getText();
   Double price = Double.valueOf(txtPrice.getText());
   Double cost = Double.valueOf(txtCost.getText());
   String category = (String)cbCategory.getSelectedItem();
   
   Product product = new Product();
   
   product.setName(name);
   product.setCategory(category);
   product.setPrice(price);
   product.setCost(cost);
   
   ProductDao.save(product);
   
   setVisible(false);
   JDialogNewProduct dialog = new JDialogNewProduct(new javax.swing.JFrame(), true);
   dialog.setVisible(true);
//   new NewStoreProduct().setVisible(true);
  }

  private void clear_inputs() {
    btn_Save.setEnabled(false);
    txtName.setText("");
    txtPrice.setText("");
    txtCost.setText("");
    
    
  } 
  private void fill_category() {
     ArrayList<model.Category> list = CategoryDao.getAllRecords();
  Iterator<model.Category> itr =  list.iterator();
  while (itr.hasNext()){
     model.Category categoryObj = itr.next();
     cbCategory.addItem(categoryObj.getName());
  }
  }
}
