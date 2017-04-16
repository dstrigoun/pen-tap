package p1;

import javax.swing.JApplet; 
import java.awt.Graphics;
import java.awt.Color;

/**
 * Face.
 * @author A00983479
 * @version 26/01/17
 */
public class Face extends JApplet {
	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            command line args
	 */
	final int PAGE_WIDTH =  600;
	final int PAGE_HEIGHT = 600;
	public void paint(Graphics page) {
		int x, y, x2, y2;
		int width, height;
		int startAngle, arcAngle; 
		
		page.setColor (Color.gray); //background
		x = 0;
		y = 0;
		width = 600;
		height = 600; 
		page.fillRect (x, y, width, height);
		
		page.setColor (Color.yellow); //head
		x = 200;
		y = 200;
		width = 200;
		height = 200;
		page.fillOval (x, y, width, height);
		
		page.setColor (Color.black); //left eye
		x = 250;
		y = 250;
		width = 30;
		height = 30;
		page.fillOval (x, y, width, height);
		
		page.setColor (Color.black); //right eye
		x = 300;
		y = 250;
		width = 30;
		height = 30;
		page.fillOval (x, y, width, height);
		
		page.setColor (Color.yellow); //right ear
		x = 370;
		y = 270;
		width = 50;
		height = 50; 
		page.fillOval (x, y, width, height);
		
		page.setColor (Color.yellow); //left ear
		x = 180;
		y = 270;
		width = 50;
		height = 50; 
		page.fillOval (x, y, width, height);
		
		page.setColor (Color.black); //nose
		x = 278;
		y = 290;
		x2 = 250;
		y2 = 310;
		page.drawLine (x, y, x2, y2);
		
		page.setColor (Color.black); //nose2
		x = 250;
		y = 310;
		x2 = 278;
		y = 310;
		page.drawLine (x, y, x2, y2);
		
		page.setColor (Color.red); //mouth
		x = 250;
		y = 300;
		width = 80;
		height = 80;
		startAngle = 0;
		arcAngle = -180; 
		page.fillArc (x, y, width, height, startAngle, arcAngle);
	}
}
