/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlertMaker;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author JovenLoba
 */
public class AlertMaker {
  public static void showSimpleMessageAlert(String message){
   String html_message = "<html><b style=\"color:Blue; font-size:20px  \"; > "+message+" </b> </html>"   ;  
        ImageIcon icon = new ImageIcon("src/popupicon/wait.png");
        JOptionPane.showMessageDialog(null, html_message,"Message",JOptionPane.INFORMATION_MESSAGE,icon);
  }
  
  public static void AlertQuery_Success(String message){
   String html_message =
      "<html><b style=\"color:Blue; font-size:14px  \"; > "+message+" </b>      </html>"   ;  
      ImageIcon icon = new ImageIcon("src/popupicon/update_check_darkgreen.png");
      JOptionPane.showMessageDialog(null, html_message,"Message",JOptionPane.INFORMATION_MESSAGE,icon);
  }
  public static void AlertQuery_Error(String message){
   String html_message =
      "<html><b style=\"color:Blue; font-size:14px  \"; > "+message+" </b>      </html>"   ;  
      ImageIcon icon = new ImageIcon("src/popupicon/error_close_red_40.png");
      JOptionPane.showMessageDialog(null, html_message,"Message",JOptionPane.ERROR_MESSAGE,icon);
  }
  
  
  
}
