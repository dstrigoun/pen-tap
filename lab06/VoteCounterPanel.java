package p1;

import java.awt.Dimension;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * VoteCounterPanel.
 * 
 * @author A00983479
 * @version 02/03/2017
 */
public class VoteCounterPanel extends JPanel{
    /**
     * Generated serial version UID
     */
    private static final long serialVersionUID = 2344787070253251327L;
    
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    
    private JLabel labelWinning;
    
    /**
     * VoteCounterPanel constructor
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;
        
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new VoteButtonListener());
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new VoteButtonListener());
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelWinning = new JLabel("");
       
        
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(labelWinning);
        
        setPreferredSize(new Dimension(300, 100));
        setBackground(Color.cyan);
    }

    /**
     * Inline VoteButtonListener class.
     * 
     * @author A00983479
     * @version 02/03/2017
     */
    private class VoteButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            } else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }
            
            if (votesForJoe == votesForSam) {
                labelWinning.setText("The votes are tied!");
            }
            else if (votesForJoe > votesForSam) 
            {
                labelWinning.setText("Joe is winning!");
            }
            else {
                labelWinning.setText("Sam is winning");
            }
            
        }
    }
}
