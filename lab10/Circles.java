package p4;

import javax.swing.JFrame;

/**
 * Circles.
 * <p>Demonstrates mouse events and drawing on a panel.</p>
 * 
 * @author A00983479
 * @version 05/04/2017
 */
public class Circles {
    /**
     * Drives the program. 
     * 
     * @param args
     *          command line arguments
     */
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CirclePanel panel = new CirclePanel();
        circlesFrame.getContentPane().add(panel);
        
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}
