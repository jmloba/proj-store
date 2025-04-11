/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package store;

import Dao.UserDao;
import model.User;

/**
 *
 * @author JovenLoba
 */
public class ChangePassword extends javax.swing.JFrame {
  static String user_Email ="" ;
  private static String mypass = "";
  /**
   * Creates new form ChangePassword
   */
  public ChangePassword(String email) {
    initComponents();
    lbl_Email.setText(email);
    user_Email = email;
        clear();
    User user  = UserDao.getUserPassword(user_Email);    
    mypass = user.getPassword();
    System.out.println("system email -->> : "+ user_Email);
    System.out.println("system oldpass -->> : "+ mypass);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    btn_Save = new javax.swing.JButton();
    btn_clear = new javax.swing.JButton();
    txtPasswordConfirm = new javax.swing.JPasswordField();
    txtPasswordOld = new javax.swing.JPasswordField();
    txtPasswordNew = new javax.swing.JPasswordField();
    lbl_Email = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(224, 242, 242));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setText("Confirm Password");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 142, 34));

    jLabel2.setText("Old Password");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 142, 33));

    jLabel3.setText("New Password");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 142, 34));

    btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
    btn_Save.setText("Save");
    btn_Save.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_SaveActionPerformed(evt);
      }
    });
    jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 125, 40));

    btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
    btn_clear.setText("Clear");
    btn_clear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_clearActionPerformed(evt);
      }
    });
    jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 117, 40));

    txtPasswordConfirm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordConfirmActionPerformed(evt);
      }
    });
    txtPasswordConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtPasswordConfirmKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPasswordConfirmKeyTyped(evt);
      }
    });
    jPanel1.add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 160, -1));

    txtPasswordOld.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordOldActionPerformed(evt);
      }
    });
    txtPasswordOld.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtPasswordOldKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtPasswordOldKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPasswordOldKeyTyped(evt);
      }
    });
    jPanel1.add(txtPasswordOld, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 160, -1));

    txtPasswordNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordNewActionPerformed(evt);
      }
    });
    txtPasswordNew.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtPasswordNewKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtPasswordNewKeyTyped(evt);
      }
    });
    jPanel1.add(txtPasswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 160, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 510, 300));
    getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 378, 388, 41));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
    
    
    String newpass =  txtPasswordNew.getText();
    String oldpass =  txtPasswordOld.getText();
    UserDao.changePassword(user_Email, oldpass, newpass);
    setVisible(false);

  }//GEN-LAST:event_btn_SaveActionPerformed

  private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
    clear();
  }//GEN-LAST:event_btn_clearActionPerformed

  private void txtPasswordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordConfirmActionPerformed

  }//GEN-LAST:event_txtPasswordConfirmActionPerformed

  private void txtPasswordConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordConfirmKeyReleased
    Validate();
  }//GEN-LAST:event_txtPasswordConfirmKeyReleased

  private void txtPasswordConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordConfirmKeyTyped

  }//GEN-LAST:event_txtPasswordConfirmKeyTyped

  private void txtPasswordOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordOldActionPerformed

  }//GEN-LAST:event_txtPasswordOldActionPerformed

  private void txtPasswordOldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordOldKeyPressed

  }//GEN-LAST:event_txtPasswordOldKeyPressed

  private void txtPasswordOldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordOldKeyReleased
    Validate();
  }//GEN-LAST:event_txtPasswordOldKeyReleased

  private void txtPasswordOldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordOldKeyTyped

  }//GEN-LAST:event_txtPasswordOldKeyTyped

  private void txtPasswordNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordNewActionPerformed

  }//GEN-LAST:event_txtPasswordNewActionPerformed

  private void txtPasswordNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordNewKeyReleased
    Validate();
  }//GEN-LAST:event_txtPasswordNewKeyReleased

  private void txtPasswordNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordNewKeyTyped

  }//GEN-LAST:event_txtPasswordNewKeyTyped

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
      java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ChangePassword(null).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_Save;
  private javax.swing.JButton btn_clear;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbl_Email;
  private javax.swing.JPasswordField txtPasswordConfirm;
  private javax.swing.JPasswordField txtPasswordNew;
  private javax.swing.JPasswordField txtPasswordOld;
  // End of variables declaration//GEN-END:variables

  private void clear() {
    txtPasswordOld.setText("");
    txtPasswordNew.setText("");
    txtPasswordConfirm.setText("");
    btn_Save.setEnabled(false);
    
  }
private void Validate() {
    String pass_old =txtPasswordOld.getText();
    String pass_new =txtPasswordNew.getText();
    String pass_confirm = txtPasswordConfirm.getText();
    
    System.out.println("Validate passold :"+ pass_old);
    System.out.println("Validate passnew :"+ pass_new);
    System.out.println("Validate passconfirm"+ pass_confirm);
    
    
    if( !pass_old.equals("") && !pass_new.equals("")  && !pass_confirm.equals("")
      && pass_old.equals( mypass) 
      && pass_new.equals(pass_confirm)){
      
      if (!pass_new.equals(pass_old) && pass_new.equals(pass_confirm)){
            btn_Save.setEnabled(true);
      }else{
        btn_Save.setEnabled(false);
//        JOptionPane.showMessageDialog(null, "Old Password is the same with new password ");
      }
    
    }else{
      System.out.println("not set");
      btn_Save.setEnabled(false);
    }
  }


}