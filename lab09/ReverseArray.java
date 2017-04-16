package p3;
//supa weird
import java.util.Scanner;

/**
 * ReverseArray.
 * 
 * @author A00983479
 * @version 30/02/2017
 */
public class ReverseArray {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int input;
        int[] values;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a number of inputs: ");
        input = scan.nextInt();
        
        values = new int[input];
        
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter a value for input " + (i+1) + ": ");
            values[i] = scan.nextInt();
        }
        
        System.out.println("\nOriginal Array: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < values.length / 2; i++) {
            int temp = values[i];
            values[i] = values[values.length - (i + 1)];
            values[values.length - (i + 1)] = temp;
        }
        
        System.out.println("\nReverse Array: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        
        scan.close();
    }
}
