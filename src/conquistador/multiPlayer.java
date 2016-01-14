/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conquistador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
//import javax.swing.JFrame;
import javax.swing.*;

/**
The SimpleScreenManager class manages initializing and
displaying full screen graphics modes.
 */
public class multiPlayer {
    Server ser;
    private GraphicsDevice device;
    /**
    Creates a new SimpleScreenManager object.
     */
    Icon icon1 = new ImageIcon("c:\\imgs\\host.jpg");
    JButton aButton = new JButton(icon1);
      Icon icon3 = new ImageIcon("c:\\imgs\\join.jpg");
    JButton joinButton = new JButton(icon3);
    Icon icon2 = new ImageIcon("c:\\imgs\\backto.jpg");
    JButton muButton = new JButton(icon2);
    JTextField textField1 = new JTextField("Lord of War");
    JTextField textField2 = new JTextField("I.P. address");
    JLabel label1= new JLabel("Require only if joining");

    public multiPlayer() {
        GraphicsEnvironment environment =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();

    }

    /**
    Enters full screen mode and changes the display mode.
     */
    public void setFullScreen(DisplayMode displayMode,
            JFrame window) {

        window.setUndecorated(true);
        window.setResizable(false);
        muldemo bgd = new muldemo();
        muButton.setBounds(686, 398, 139, 43);
        textField1.setBounds(630-120, 328-10, 225, 25);
        textField2.setBounds(630-120, 210, 225, 25);
        window.getContentPane().add(muButton);
        window.getContentPane().add(textField1);
        window.getContentPane().add(textField2);
        label1.setBounds(630-120+225, 210, 225, 25);
        window.getContentPane().add(label1);
        // window.add(bgd);
        muButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        muButton.setToolTipText("Back TO Main");
        muButton.setBorder(null);
        muButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\imgs\\backto1.jpg"));
        muButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });


        aButton.setBounds(282, 398, 139, 43);
        window.getContentPane().add(aButton);
    
        aButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        aButton.setToolTipText("Host");
        aButton.setBorder(null);
        aButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\imgs\\host1.jpg"));

        aButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        joinButton.setBounds(500, 398, 139, 43);
        window.getContentPane().add(joinButton);
            window.add(bgd);
        joinButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        joinButton.setToolTipText("Join");
        joinButton.setBorder(null);
        joinButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\imgs\\join1.jpg"));

        joinButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });

        device.setFullScreenWindow(window);
        if (displayMode != null &&
                device.isDisplayChangeSupported()) {
            try {
                device.setDisplayMode(displayMode);
            } catch (IllegalArgumentException ex) {
                // ignore - illegal mode for this device
            }
        }
    }

    /**
    Returns the window currently used in full screen mode.
     */
    public Window getFullScreenWindow() {
        return device.getFullScreenWindow();
    }

    /**
    Restores the screen's display mode.
     */
    public void restoreScreen() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            window.dispose();
        }
        device.setFullScreenWindow(null);
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:

         multiPlayer scren = new  multiPlayer();
        scren.restoreScreen();

        DisplayMode displayMode;
        displayMode = new DisplayMode(1024, 768, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);
        FullScreenTest test = new FullScreenTest();
        test.run(displayMode);



    }

    
    private void startActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:

         multiPlayer scren = new  multiPlayer();
        scren.restoreScreen();
        ser=new Server();
        
        


    }
    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        String playerId=textField1.getText();
        String ipAddress=textField2.getText();

         multiPlayer scren = new  multiPlayer();
        scren.restoreScreen();
        //frame.runclient(playerId,ipAddress);
        System.out.println(playerId);
        System.out.println(ipAddress);
        
        


    }
}
