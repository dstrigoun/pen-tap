package p1;

import javax.swing.JFrame;

/**
 * VoteCounter.
 * 
 * @author A00983479
 * @version 02/02/2017
 */
public class VoteCounter {
    /**
     * Drives the program.
     * 
     * @param args
     *        Command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new VoteCounterPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
