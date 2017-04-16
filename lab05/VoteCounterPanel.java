package p1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * VoteCounterPanel.
 * 
 * @author Doosha
 * @version 12/02/2017
 */
@SuppressWarnings("serial")
public class VoteCounterPanel extends JPanel {
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    
    /**
     * Constructs 2 new objects in button form???
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;
        
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        
        setPreferredSize(new Dimension(300, 80));
        setBackground(Color.pink);
    }
    
    /**
     * JoeButtonListener.
     * 
     * @author Doosha
     * @version 12/02/2017
     */
    private class JoeButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    
    /**
     * SamButtonListener.
     * 
     * @author Doosha
     * @version 12/02/2017
     */
    private class SamButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}
