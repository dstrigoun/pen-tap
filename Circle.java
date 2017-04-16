package p1;

/**
 * Circle.
 * 
 * @author A00983479
 * @version 23/01/17
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle {
	/**
	 * Drives the program.
	 * @param args command line args
	 */
	public static void main(String[] args){
		
		final double PI = 3.14159;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("#.###");
		
		int radius = 10;
		double area1 = PI * radius * radius;
		double circumference1 = 2 * PI * radius;
		double area2 = PI * radius * radius;
		double circumference2 = 2 * PI * radius;
		double divisionOfAreas = area2 / area1;
		double divisionOfCircum = circumference2 / circumference1;
		
		System.out.println("Please enter a value for the radius:");
		radius = scan.nextInt();
		
		area1 = PI * radius * radius;
		circumference1 = 2 * PI * radius;
		
		System.out.println("The area of a circle with radius " 
					       + radius + " is " + fmt.format(area1));
		System.out.println("The circumference of a circle with radius "
						   + radius + " is " + fmt.format(circumference1));
		System.out.println();
		
		radius = 2 * radius;
		area2 = PI * radius * radius;
		circumference2 = 2 * PI * radius;
		
		System.out.println("The area of a circle with twice the radius, " 
					       + radius + ", is " + fmt.format(area2));
		System.out.println("The circumference of a circle with twice the radius, "
						   + radius + ", is " + fmt.format(circumference2));
		System.out.println();
		
		divisionOfAreas = area2 / area1;
		divisionOfCircum = circumference2 / circumference1;
		
		System.out.println("The division of the two areas is " 
						   + divisionOfAreas);
		System.out.println("The division of the two circumferences is "
						   + divisionOfCircum);
		
		scan.close();
	}

}
