package p4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * CirclePanel. 
 * <p>Represents the primary panel for the Circles program
 * on which the circles are drawn.</p>
 * 
 * @author A00983479
 * @version 05/04/2017
 */
public class CirclePanel extends JPanel {
    private static final long serialVersionUID = 7723005920898674510L;
    
    private final int WIDTH = 600, HEIGHT = 400;
    private Circle circle;
    
    public CirclePanel() {
        addMouseListener(new CirclesListener()); 
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.white);
    }
    
    public void paintComponent(Graphics page) {
        super.paintComponent(page); 
        if (circle != null)
            circle.draw(page);
    }
    
    private class CirclesListener implements MouseListener {
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else if (circle.isInside(event.getPoint())) {
                circle = new Circle(event.getPoint());
            } else {
                circle.move(event.getPoint());
            }
            repaint();  
        }
        /** {@inheritDoc} */
        public void mouseClicked(MouseEvent event) {}
        /** {@inheritDoc} */
        public void mouseReleased(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {
            setBackground(Color.white);
        }
        public void mouseExited(MouseEvent event) {
            setBackground(Color.blue);
        }
    }
}
