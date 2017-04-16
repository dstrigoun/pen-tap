package p1;

/**
 * IdealWeight.
 * 
 * @author A00983479
 * @version 21/01/17
 */
import java.util.Scanner;

public class IdealWeight {
	/**
	 * Drives the program.
	 * @param args command line args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int heightFeet = 5; 
		int heightInches = 5;
		int heightTotal = (heightFeet * 12) + heightInches;
		int femaleWeight = ((heightTotal - 60) * 5) + 100;
		int maleWeight = ((heightTotal - 60) * 6) + 106;
		double femaleRangePlus = femaleWeight * 1.15;
		double femaleRangeMinus = femaleWeight - (femaleWeight * 0.15);
		double maleRangePlus = maleWeight * 1.15;
		double maleRangeMinus = maleWeight - (maleWeight * 0.15);
		
		
		System.out.println("Please enter your height in feet "
						   + "and inches(with a space in between):");
		heightFeet = scan.nextInt();
		heightInches = scan.nextInt();
		
		heightTotal = (heightFeet * 12) + heightInches;
		femaleWeight = ((heightTotal - 60) * 5) + 100; 
		maleWeight = ((heightTotal - 60) * 6) + 106;
		femaleRangePlus = femaleWeight * 1.15;
		femaleRangeMinus = femaleWeight - (femaleWeight * 0.15);
		maleRangePlus = maleWeight * 1.15;
		maleRangeMinus = maleWeight - (maleWeight * 0.15); 
		
		System.out.println("The ideal weight for a female at "
						   + heightFeet + " feet and " + heightInches 
						   + " inches is " + femaleWeight + " pounds.");
		System.out.println("The healthy range for this height is from  "
						   + femaleRangeMinus + " - " + femaleRangePlus + " pounds.");
		System.out.println();
		System.out.println("The ideal weight for a male at "
						   + heightFeet + " feet and " + heightInches 
						   + " inches is " + maleWeight + " pounds."); 
		System.out.println("The healthy range for this height is from "
						   + maleRangeMinus + " - " + maleRangePlus + " pounds.");
		
		scan.close();
	}

}
