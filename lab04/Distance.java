package p1;

import java.util.Scanner;

/**
 * Distance.
 * @author A00983479
 * @version 02/02/2017
 */
public class Distance {
	
	/**
	 * Drives the program.
	 * 
	 * @param args
	 * 			  Command line arguments
	 */
	public static void main(String[] args){
		double x1, y1, x2, y2;
		double xDiff, yDiff;
		double quantity;
		double distance;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the first point " + 
						" (put a space between them): ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		
		System.out.print("Enter the coordinates of the second point: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		xDiff = x1 - x2;
		yDiff = y1 - y2;
		quantity = Math.pow((xDiff), 2) + Math.pow((yDiff), 2);
		distance = Math.sqrt(quantity);
		
		System.out.println("The distance between point A: (" + x1 + ", " + y1 + 
							") and point B: (" + x2 + ", " + y2 + ") is " + distance);
		
		scan.close();
	}

}
