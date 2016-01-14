/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conquistador;

import java.awt.*;
//import javax.swing.JFrame;
import javax.swing.*;

/**
The SimpleScreenManager class manages initializing and
displaying full screen graphics modes.
 */
public class SimpleScreenManager {

    private GraphicsDevice device;
    /**
    Creates a new SimpleScreenManager object.
     */
    Icon icon1 = new ImageIcon("imgs/exit.jpg");
    JButton aButton = new JButton(icon1);
    Icon icon2 = new ImageIcon("imgs/multiplayer.jpg");
    JButton muButton = new JButton(icon2);
    Icon icon3 = new ImageIcon("imgs/historical.jpg");
    JButton hiButton = new JButton(icon3);

    public SimpleScreenManager() {
        GraphicsEnvironment environment =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();

    }

    /**
    Enters full screen mode and changes the display mode.
     * @param displayMode
     * @param window
     */
    public void setFullScreen(DisplayMode displayMode,
            JFrame window) {

        window.setUndecorated(true);
        window.setResizable(false);
        BGDemo bgd = new BGDemo();
        muButton.setBounds(271 - 160, 419 - 50, 390, 49);
        window.getContentPane().add(muButton);
        // window.add(bgd);
        muButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        muButton.setToolTipText("NetworkMode");
        muButton.setBorder(null);
        muButton.setRolloverIcon(new javax.swing.ImageIcon("imgs/multiplayer1.jpg"));

        muButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerActionPerformed(evt);
            }
        });
        hiButton.setBounds(271 - 160, 419-110 , 390, 49);
        window.getContentPane().add(hiButton);
        // window.add(bgd);
        hiButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        hiButton.setToolTipText("Historical Campaign");
        hiButton.setBorder(null);
        hiButton.setRolloverIcon(new javax.swing.ImageIcon("imgs/historical1.jpg"));

        hiButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicalActionPerformed(evt);
            }
        });


        aButton.setBounds(272 - 160, 487 - 50, 390, 49);
        window.getContentPane().add(aButton);
        window.add(bgd);
        aButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        aButton.setToolTipText("Exit");
        aButton.setBorder(null);
        aButton.setRolloverIcon(new javax.swing.ImageIcon("imgs/exit1.jpg"));

        aButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
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

            device.setFullScreenWindow(null);

        }
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        SimpleScreenManager scren = new SimpleScreenManager();
        scren.restoreScreen();


    }

    private void multiplayerActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        //Server serv = new Server ();
        SimpleScreenManager scren = new SimpleScreenManager();
        scren.restoreScreen();
        DisplayMode displayMode;

        displayMode =
        new DisplayMode(1024, 768, 16,
        DisplayMode.REFRESH_RATE_UNKNOWN);
        FullScreenTest test = new FullScreenTest();

        test.run1(displayMode);

        
        


        /*campaigntest test1 = new campaigntest();
        test1.run(displayMode);*/
      
       
      //  frame f=new frame();
        //f.setVisible(true);

    }

    private void historicalActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        //Server serv = new Server ();
        SimpleScreenManager scren = new SimpleScreenManager();
        scren.restoreScreen();
        //campaignSelect c=new campaignSelect();

        DisplayMode displayMode;

        displayMode =
        new DisplayMode(1024, 768, 16,
        DisplayMode.REFRESH_RATE_UNKNOWN);
        FullScreenTest test = new FullScreenTest();

        test.run2(displayMode);




        /*campaigntest test1 = new campaigntest();
        test1.run(displayMode);*/

    }
}
