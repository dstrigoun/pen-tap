package p1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Deli. 
 * 
 * @author A00983479
 * @version 05/02/2017
 */
public class Deli {
	/**
	 * Drives the program.
	 * 
	 * @param args
	 * 			  Command line arguments
	 */
	public static void main(String[] args){
		final double OUNCES_PER_POUND = 16.0;
		
		double pricePerPound;
		double weightOunces;
		double weight;
		double totalPrice;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat fmt = new DecimalFormat("#.##");
		
		System.out.println("Welcome to the CST Deli!! \n");
		
		System.out.print("Enter the price per pound of your item: ");
		pricePerPound = scan.nextDouble();
		
		System.out.print("Enter the weight (ounces): ");
		weightOunces = scan.nextDouble();
		
		weight = weightOunces / OUNCES_PER_POUND;
		totalPrice = pricePerPound * weight;
		
		System.out.println();
		System.out.println("*****CSDeli*****");
		System.out.println();
		System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
		System.out.println("Weight: " + fmt.format(weight) + " pounds");
		System.out.println();
		System.out.println("TOTAL: " + money.format(totalPrice));
		
		scan.close();
	}
	
}
