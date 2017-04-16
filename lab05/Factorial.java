package p1;

import java.util.Scanner;

/**
 * Factorial.
 * 
 * @author Doosha
 * @version 13/02/2017
 */
public class Factorial {
    /**
     * Drives the program.
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args){
        int userInput;
        int n;
        int result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a non-negative integer: ");
        userInput = scan.nextInt();
        
        while (0 > userInput) {
            System.out.println("Sorry, that's not right, " 
                                + "please enter a non-negative integer:");
            userInput = scan.nextInt();
        }
        
        n = 1;
        result = 1;
        while (n <= userInput) {
            result = result * n;
            n++;
        }
        
        System.out.println("The factorial of " + userInput 
                           + " is " + result);
        
        scan.close();
    }
}
