/*
 * storyScreenManager.java
 *
 * Created on March 9, 2010, 1:14 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package conquistador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
//import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author amir
 */
public class storyScreenManager{
   campaignSelect c;
    /** Creates a new instance of storyScreenManager */
    
  /*
   * To change this template, choose Tools | Templates
   * and open the template in the editor.
   */
    
    /**
     * The SimpleScreenManager class manages initializing and
     * displaying full screen graphics modes.
     */
    
    
    private GraphicsDevice device;
    /**
     * Creates a new SimpleScreenManager object.
     */
    Icon icon1 = new ImageIcon("c:\\imgs\\back.jpg");
    JButton aButton = new JButton(icon1);
    Icon icon2 = new ImageIcon("c:\\imgs\\start.jpg");
    JButton muButton = new JButton(icon2);
    public String playId;
    
    
    public storyScreenManager() {
        GraphicsEnvironment environment =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();
       
    }
    
    /**
     * Enters full screen mode and changes the display mode.
     */
    
    public void setFullScreen(DisplayMode displayMode,
            JFrame window) {
        //playId=playerId;
        window.setUndecorated(true);
        window.setResizable(false);
        smdemo bgd = new smdemo();
        muButton.setBounds(764-120, 625-10, 225, 49);
        window.getContentPane().add(muButton);
        
        muButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        muButton.setToolTipText("start");
        muButton.setBorder(null);
        muButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\imgs\\start1.jpg"));
        muButton.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        
        
        aButton.setBounds(284-120, 625-10, 225, 49);
        window.getContentPane().add(aButton);
        window.add(bgd);
        aButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        aButton.setToolTipText("back");
        aButton.setBorder(null);
        aButton.setRolloverIcon(new javax.swing.ImageIcon("C:\\imgs\\back1.jpg"));
        
        aButton.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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
     * Returns the window currently used in full screen mode.
     */
    public Window getFullScreenWindow() {
        return device.getFullScreenWindow();
    }
    
    /**
     * Restores the screen's display mode.
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
        
        campaignscreenmanager scren = new campaignscreenmanager();
        scren.restoreScreen();
        
        DisplayMode displayMode;
        displayMode = new DisplayMode(3000, 2000, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);
        FullScreenTest test = new FullScreenTest();
        test.run1(displayMode);
        
        
        
    }
    
    private void startActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        
        campaignscreenmanager scren = new campaignscreenmanager();
        scren.restoreScreen();
        c=new campaignSelect();
        
        //campaignSelect c=new campaignSelect();
        
        //frame.campaign(playerId);
        
        
        
        
    }

    //@Override
    
}



