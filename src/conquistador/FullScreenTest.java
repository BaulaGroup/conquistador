/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conquistador;

import java.awt.*;
import javax.swing.JFrame;

public class FullScreenTest extends JFrame {
    
    public void run(DisplayMode displayMode) {

        SimpleScreenManager screen = new SimpleScreenManager();
        screen.setFullScreen(displayMode, this);


    }

    public void run2(DisplayMode displayMode) {

        campaignscreenmanager screen = new campaignscreenmanager();
        screen.setFullScreen(displayMode, this);


    }
     public void run1(DisplayMode displayMode) {

      multiPlayer screen = new multiPlayer();
        screen.setFullScreen(displayMode, this);


    }
      public void run3(DisplayMode displayMode) {

    storyScreenManager screen = new storyScreenManager();
        screen.setFullScreen(displayMode, this);


    }
}
