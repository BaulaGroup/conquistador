/*
 * smdemo.java
 *
 * Created on March 9, 2010, 1:29 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author amir
 *//*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conquistador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Background image demo
 */

public class smdemo extends JPanel {
  Image bgImage=null;
  JButton aButton=new JButton();
  int z=-120;
  int y=-70-10;

  String message="";
  public smdemo() {
    super(null);
    try {
      getFileImage("imgs/story_mode.jpg");

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

