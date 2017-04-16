package p3;

import javax.swing.JFrame;

/**
 * Rebound.
 * <p></p>
 *
 * @author A00983479
 * @version 12/04/2017
 */
public class Rebound {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rebound");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new ReboundPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
