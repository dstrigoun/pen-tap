package p1;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 * PieChart.
 * @author A00983479
 * @version 30/01/2017
 */
public class PieChart extends JApplet {
	/**
	 * Drives the program. 
	 * @param args command line args
	 */
	final int PAGE_WIDTH = 600;
	final int PAGE_HEIGHT = 600;
	public void paint (Graphics page){
		
		int x, y;
		int width, height; 
		int startAngle, arcAngle;
		
		page.setColor (Color.gray); //background
		x = 0;
		y = 0;
		width = 600;
		height = 600;
		page.fillRect (x, y, width, height);
		
		page.setColor (Color.red); //Rent and Utilities
		x = 210;
		y = 200;
		width = 200;
		height = 200;
		startAngle = 0;
		arcAngle = 126;
		page.fillArc (x, y, width, height, startAngle, arcAngle);
		
		page.setColor (Color.yellow); //Transportation
		x = 210;
		y = 200; 
		width = 200;
		height = 200; 
		startAngle = 126;
		arcAngle = 54;
		page.fillArc (x, y, width, height, startAngle, arcAngle);
		
		page.setColor (Color.orange); //Food
		x = 210;
		y = 200; 
		width = 200;
		height = 200; 
		startAngle = 180;
		arcAngle = 54;
		page.fillArc (x, y, width, height, startAngle, arcAngle);
		
		page.setColor (Color.green); //Educational
		x = 210;
		y = 200; 
		width = 200;
		height = 200; 
		startAngle = 234;
		arcAngle = 90;
		page.fillArc (x, y, width, height, startAngle, arcAngle);
		
		page.setColor (Color.blue); //Miscellaneous
		x = 210;
		y = 200; 
		width = 200;
		height = 200; 
		startAngle = 324;
		arcAngle = 36;
		page.fillArc (x, y, width, height, startAngle, arcAngle);
		
		page.setColor (Color.black);
		page.setFont (page.getFont().deriveFont(15f));
		x = 300;
		y = 190;
		page.drawString("Rent and Utilities: 35%", x, y);
		
		page.setColor (Color.black);
		x = 90;
		y = 250;
		page.drawString("Transportation: 15%", x, y);
		
		page.setColor (Color.black);
		x = 145;
		y = 350;
		page.drawString("Food: 15%", x, y);
		
		page.setColor (Color.black);
		x = 300;
		y = 420;
		page.drawString("Education: 35%", x, y);
		
		page.setColor (Color.black);
		x = 410;
		y = 330;
		page.drawString ("Miscellaneous: 10%", x, y);
		
	}
}
