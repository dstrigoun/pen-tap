package p1;

import java.util.Scanner;

/**
 * IntWrapper.
 * 
 * @author A00983479
 * @version 05/02/2017
 */
public class IntWrapper {
	/**
	 * Drives the program.
	 * 
	 * @param args
	 * 			  Command line arguments
	 */
	public static void main(String[] args){
		int num;
		String input1,input2;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		num = scan.nextInt();
		
		System.out.println("You entered: " + num);
		System.out.println("Binary Conversion: " + Integer.toBinaryString(num));
		System.out.println("Octal Conversion: " + Integer.toOctalString(num));
		System.out.println("Hexidecimal Conversion: " + Integer.toHexString(num));
		System.out.println();
		
		System.out.println("Minimum value an int can have: " + Integer.MIN_VALUE);
		System.out.println("Maximum value an int can have: " + Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("Please enter 2 integers: ");
		input1 = scan.next();
		input2 = scan.next();
		
		sum = Integer.valueOf(input1) + Integer.valueOf(input2);
		
		System.out.println("The sum of those two values is: " + sum);

		scan.close();
	}
	
}
