package p2;

import java.util.Scanner;

/**
 * Comparisons.
 * 
 * @author A00983479
 * @version 14/03/2017
 */
public class Comparisons {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a string.");
        str1 = scan.nextLine();
        System.out.println("Please enter a second string.");
        str2 = scan.nextLine();
        System.out.println("Please enter a third string.");
        str3 = scan.nextLine();
        
        System.out.println();
        System.out.println("The largest string is: " 
                            + Compare3.largest(str1, str2, str3));
        
        System.out.println("Please enter an int");
        int int1 = scan.nextInt();
        System.out.println("Please enter a second int");
        int int2 = scan.nextInt();
        System.out.println("Please enter a third int");
        int int3 = scan.nextInt();
        
        System.out.println();
        System.out.println("The largest int is: " 
                            + Compare3.largest(int1, int2, int3));
        
        scan.close();
    }
}
