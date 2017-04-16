package p3;

import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        int maxEdge;
        int x, y;
        int maxSteps = Integer.MAX_VALUE;
        int currentSteps;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the max boundary: ");
        maxEdge = scan.nextInt();
        System.out.println("Please enter the destination coordinates(x y): ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        RandomWalk walk1 = new RandomWalk(maxSteps, maxEdge);
        
        currentSteps = 0;
        while (walk1.moreSteps() && walk1.inBounds() && !(walk1.getX() == x && walk1.getY() == y)) {
            System.out.println(walk1.getX() + ", " + walk1.getY());
            walk1.takeStep();
            currentSteps++;
        }
        
        if (walk1.getX() == x && walk1.getY() == y) {
            System.out.println("Reached coordinates in " + currentSteps + " steps.");
        }
        else if (!(walk1.inBounds())) {
            System.out.println("Fell off the edge. Sad!");
        }
        else {
            System.out.println("Reached the maximum number of steps.");
        }
    }
}
