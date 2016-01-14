/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conquistador;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Background image demo
 */

public class BGDemo extends JPanel {
  Image bgImage=null;
  JButton aButton=new JButton();
  int z=-180;
  int y=-150;

  String message="";
  public BGDemo() {
    super(null);
    try {
      getFileImage("c:\\imgs\\main_screen.jpg");
        
    }
    catch (Exception ex) {
      message="File load failed: "+ex.getMessage();
    }
  }

    @Override

  public void paintComponent(Graphics g) {
    if (bgImage!=null) {
      
      g.drawImage(bgImage,z,y,this);
    } else {
      g.drawString(message,40,40);
    }
  }

  private void getFileImage(String filePath) throws InterruptedException, IOException {
    FileInputStream in = new FileInputStream(filePath);
    byte [] b=new byte[in.available()];
    in.read(b);
    in.close();
    bgImage=Toolkit.getDefaultToolkit().createImage(b);
    MediaTracker mt=new MediaTracker(this);
    mt.addImage(bgImage,0);
    mt.waitForAll();
  }
   
    }
