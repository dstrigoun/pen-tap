package p3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * ReboundPanel.
 * <p></p>
 * 
 * @author A00983479
 * @version 12/04/2017
 */
public class ReboundPanel extends JPanel {
    /**Automatically generated serial version UID.*/
    private static final long serialVersionUID = -6889086671900891084L;
    private final int WIDTH = 600, HEIGHT = 600;
    private final int DELAY = 10, IMAGE_SIZE = 5;
    
    private ImageIcon image;
    private ImageIcon image2;
    private Timer timer;
    private int x, y, moveX, moveY;
    private int x2, y2, moveX2, moveY2;
    
    /**
     * <p>Sets up a panel for the images to bounce off walls and
     * hopefully each other.</p>
     */
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon("pe391gqq8joy.png");
        image2 = new ImageIcon("pe391gqq8joy.png");
        
        x = 0;
        y = 40;
        moveX = moveY = 3;
        x2 = 40;
        y2 = 0;
        moveX2 = 5;
        moveY2 = 8; 
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }
    
    /**
     * <p>Sets up drawing component.</p>
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
        image2.paintIcon(this, page, x2, y2);
    }
    
    /**
     * <p>ReboundListener.</p>
     * 
     * @author A00983479
     * @version 13/04/2017
     */
    private class ReboundListener implements ActionListener {
        /**
         * <p>Gets the images to bounce off the walls and each other.</p>
         */
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;
            x2 += moveX2;
            y2 += moveY2;
            
            if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
                moveX *= -1;
            if (y <= 0 || y >= HEIGHT - IMAGE_SIZE) 
                moveY *= -1;
            
            if (x2 <= 0 || x2 >= WIDTH - IMAGE_SIZE)
                moveX2 *= -1;
            if (y2 <= 0 || y2 >= HEIGHT - IMAGE_SIZE)
                moveY2 *= -1;
            
            if (x + (IMAGE_SIZE / 2) == x2 || x2 + (IMAGE_SIZE / 2) == x) {
                moveX *= -1;
                moveX2 *= -1;
            }
            if (y + (IMAGE_SIZE / 2) == y2 || y2 + (IMAGE_SIZE / 2) == y) {
                moveY *= -1;
                moveY2 *= -1;
            }
            
            repaint();
        }
    }
}
