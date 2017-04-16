package p3;

import java.util.Scanner;

/**
 * TestWalk.
 * 
 * @author A00983479
 * @version 10/03/2017
 */
public class TestWalk {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int maxSteps;
        int maxCoord;
        int x, y;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        
        System.out.print("Enter the starting x and y coordinates with " +
                        "a space between:");
        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk userWalk = new RandomWalk(maxSteps, maxCoord, x, y);
        RandomWalk compWalk = new RandomWalk(10, 5, 0, 0);
        
        int steps = 5;
        for (int i = 0; i < steps; i++) {
            userWalk.takeStep();
            compWalk.takeStep();
        }
        
        System.out.println();
        System.out.println("User " + userWalk);
        System.out.println("Maximum distance: " + userWalk.getMaxDistance());
        System.out.println();
        System.out.println("Computer " + compWalk);
        System.out.println("Maximum distance: " + compWalk.getMaxDistance());
        
        scan.close();
    }
}
