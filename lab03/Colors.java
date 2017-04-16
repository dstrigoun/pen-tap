package p1;

/**
 * Colors.
 * @author Administrator
 * @version 01/02/2017
 */
import javax.swing.JApplet;
import java.awt.*;

public class Colors extends JApplet {
	/**
	 * Not sure.
	 * @param page
	 */
	public void paint (Graphics page) {
		final int PAGE_WIDTH = 600;
		final int PAGE_HEIGHT = 400; 
		
		int x, y;
		int width, height;
		
		Color myColor = new Color (200, 100, 255);
		
		page.setColor(Color.white);
		x = 0;
		y = 0;
		width = 600;
		height = 400;
		page.fillRect (x, y, width, height);
		
		page.setColor (myColor);
		x = 200; 
		y = 125;
		width = 200;
		height = 150;
		page.fillRect (x, y, width, height);
		
	}

}
