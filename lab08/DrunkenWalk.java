package p3;

import java.util.Scanner;

/**
 * DrunkenWalk.
 * 
 * @author A00983479
 * @version 23/03/2017
 */
public class DrunkenWalk {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int maxSteps;
        int maxCoord;
        int x = 0;
        int y = 0;
        int drunks;
        int fall = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nRandom Drunk Walk.");
        System.out.println("Please enter the boundary for the square dock.");
        maxCoord = scan.nextInt();
        System.out.println("Please enter the maximum number of steps.");
        maxSteps = scan.nextInt();
        System.out.println("Please enter the number of drunks.");
        drunks = scan.nextInt();
        
        for (int i = 0; i < drunks; i++) {
            RandomWalk dummy = new RandomWalk(maxSteps, maxCoord, x, y);
            
            dummy.walk();
            
            if (!dummy.inBounds()) 
                fall++;
        }
        
        System.out.println(fall + ((fall == 1) ? (" drunk") : (" drunks")) + " fell off the dock.");
        
        scan.close();
    }
}
