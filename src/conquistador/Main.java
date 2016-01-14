/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conquistador;

import java.awt.DisplayMode;

/**
 *
 * @author Rohanko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DisplayMode displayMode;
        if (args.length == 3) {
            displayMode = new DisplayMode(
                    Integer.parseInt(args[0]),
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]),
                    DisplayMode.REFRESH_RATE_UNKNOWN);
        } else {
            displayMode = new DisplayMode(1000, 800, 16,
                    DisplayMode.REFRESH_RATE_UNKNOWN);
        }

        FullScreenTest test = new FullScreenTest();
        // int x=10,y=10;
        test.run(displayMode);
    }
}
