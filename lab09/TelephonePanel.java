package p1;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * TelephonePanel. 
 * 
 * @author A00983479
 * @version 29/03/2017
 */
public class TelephonePanel extends JPanel {
    /**Randomly generated serial version UID. */
    private static final long serialVersionUID = -250955401014143532L;
    
    /**
     * Constructor for the Telephone Panel.
     */
    public TelephonePanel() {
        setLayout(new BorderLayout());
        
        JLabel title = new JLabel("Your Telephone",
                JLabel.CENTER);
        
        title.setHorizontalTextPosition(JLabel.CENTER);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("*");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("#");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(b10);
        buttonPanel.add(b11);
        buttonPanel.add(b12); 
        
        add(title, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

    }
}
