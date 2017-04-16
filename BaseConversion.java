package p1;

/**
 * BaseConversion.
 * 
 * @author A00983479
 * @version 21/01/17
 */
import java.util.Scanner;

public class BaseConversion {
	/**
	 * Drives the program.
	 * @param args command line args
	 */
	public static void main(String[] args){
		
		int base = 5;
		int base10Num;
		int maxNumber = (int) (Math.pow(base, 4) - 1); 
		
		int place0;
		int place1;
		int place2;
		int place3;
		
		String baseBNum = new String ("");
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println();
		System.out.print("Please enter a base (2-9): ");
		base = scan.nextInt();
		
		maxNumber = (int) Math.pow(base, 4) - 1;
		
		System.out.println("The maximum number that will fit in base 10 is "
					     + maxNumber);
		System.out.println();
		System.out.print("Please enter a base 10 number to convert: ");
		base10Num = scan.nextInt();
		
		place0 = base10Num % base;
		base10Num = base10Num / base;
		place1 = base10Num % base;
		base10Num = base10Num / base;
		place2 = base10Num % base;
		base10Num = base10Num / base;
		place3 = base10Num % base;
		base10Num = base10Num / base;
		
		baseBNum = baseBNum + place3 + place2 + place1 + place0;
		
		System.out.println("The base 10 number for base " + base 
							+ " is: " + baseBNum);
		
		scan.close();
	}

}
