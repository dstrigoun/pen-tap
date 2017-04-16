package p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ColorOptionsPanel. 
 * <p>Represents the user interface for the ColorOptions
 * program that lets the user change background color by 
 * selecting a radio button.</p>
 * 
 * @author A00983479
 * @version 03/04/2017
 */
public class ColorOptionsPanel extends JPanel {
    private static final long serialVersionUID = -3354539908903228768L;
    
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JRadioButton[] colorButton = new JRadioButton[NUM_COLORS];
    private JLabel heading;
    /**
     * Sets up panel with radio buttons.
     */
    public ColorOptionsPanel() {
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));
        
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        
        colorButton[0] = new JRadioButton("Yellow", true);
        colorButton[1] = new JRadioButton("Cyan", true);
        colorButton[2] = new JRadioButton("Red", true);
        colorButton[3] = new JRadioButton("Green", true);
        colorButton[4] = new JRadioButton("Magenta", true);
        
        //instantiate a ButtonGroup object and a ColorListener object
        ButtonGroup group = new ButtonGroup();
        ColorListener colorAction = new ColorListener();
        
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        for (int i = 0; i < color.length; i++) {
            group.add(colorButton[i]);
            colorButton[i].addActionListener(colorAction); 
            add(colorButton[i]);
        }
    }
    /**
     * ColorListener.
     * 
     * @author A00983479
     * @version 03/04/2017
     */
    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < NUM_COLORS; i++) {
                if (colorButton[i].isSelected()) {
                    setBackground(color[i]);
                }
            }
        }
    }
}
