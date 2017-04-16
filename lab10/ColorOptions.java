package p2;

import javax.swing.JFrame;

/**
 * ColorOptions. 
 * <p>Uses an array of radio buttons to change the background colour.</p>
 * 
 * @author A00983479
 * @version 03/04/2017
 */
public class ColorOptions {
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        
        colorFrame.pack();
        colorFrame.setVisible(true);
    }
}
