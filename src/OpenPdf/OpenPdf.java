/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenPdf;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author JovenLoba
 */
public class OpenPdf {
  public static void openById(String path, int id){
    try{
      if ((new File(path+id+".pdf")).exists()){
        Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler "+path+id+".pdf ");
      } else{
        JOptionPane.showMessageDialog(null, "File does not exists");
      }
    
    }catch(Exception ex){
      JOptionPane.showMessageDialog(null, ex);
    }
  }
  
}
