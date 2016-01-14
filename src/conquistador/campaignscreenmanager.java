/*
 * To change this template, choose Tools | Templates
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
 * The SimpleScreenManager class manages initializing and
 * displaying full screen graphics modes.
 */
public class campaignscreenmanager {
    
    private GraphicsDevice device;
    /**
     * Creates a new SimpleScreenManager object.
     */
    Icon icon1 = new ImageIcon("imgs/back.jpg");
    JButton aButton = new JButton(icon1);
    Icon icon2 = new ImageIcon("imgs/start.jpg");
    JButton muButton = new JButton(icon2);
    JTextField textField1 = new JTextField("Lord of War");
    String string[]={ "Mission 1 The Begining", "Mission 2 Ready to Attack", "Mission 3 Get Some Revenge", "Mission 4 Thought Of Unification"};
    
    
    
    
    public campaignscreenmanager() {
        GraphicsEnvironment environment =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();
        
    }
    
    /**
     * Enters full screen mode and changes the display mode.
     */

    public void setFullScreen(DisplayMode displayMode,
            JFrame window) {
        
        window.setUndecorated(true);
        window.setResizable(false);
        cmdemo bgd = new cmdemo();
        JList mission = new JList(string);
        mission.setVisibleRowCount(4);
        JScrollPane pane = new JScrollPane(mission);
        pane.setBounds(400, 400, 225, 70);
        window.getContentPane().add(pane);

    
        muButton.setBounds(764-120, 625-10, 225, 49);
        textField1.setBounds(630-120, 328-10, 225, 25);
        window.getContentPane().add(muButton);
        window.getContentPane().add(textField1);
        // window.add(bgd);
        muButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        muButton.setToolTipText("start");
        muButton.setBorder(null);
        muButton.setRolloverIcon(new javax.swing.ImageIcon("imgs/start1.jpg"));
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
        aButton.setRolloverIcon(new javax.swing.ImageIcon("imgs/back1.jpg"));
        
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
        test.run(displayMode);
        
        
        
    }
    
    private void startActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
        
        campaignscreenmanager scren = new campaignscreenmanager();
        scren.restoreScreen();
        //campaignSelect c=new campaignSelect();
        String playerId=textField1.getText();
           
        DisplayMode displayMode;
        displayMode = new DisplayMode(3000, 2000, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);
        FullScreenTest test = new FullScreenTest();
        test.run3(displayMode);
        //System.out.println(playerId);
        //frame.campaign(playerId);
        
        
        
        
    }
}
