package p3;

import java.util.Random;

/**
 * RandomWalk.
 * 
 * @author A00983479
 * @version 10/03/2017
 */
public class RandomWalk {
    private int xPosition;
    private int yPosition;
    private int maxSteps;
    private int currentSteps;
    private int boundary;
    private int maxDistance;
    
    /**
     * Constructs an empty RandomWalk with maximum steps 
     * and the edge.
     * 
     * @param max
     *          maximum number of steps
     * @param edge
     *          length of boundary
     */
    public RandomWalk(int max, int edge) {
        this.maxSteps = max;
        this.boundary = edge;
        
        this.xPosition = 0;
        this.yPosition = 0;
        this.maxDistance = 0;
    }
    
    /**
     * Constructs an empty RandomWalk with maximum steps, an edge, 
     * and a starting coordinate (x, y).
     * 
     * @param max
     *          maximum number of steps
     * @param edge
     *          length of boundary
     * @param startX
     *          starting x position
     * @param startY
     *          starting y position
     */
    public RandomWalk(int max, int edge, int startX, int startY) {
        this.maxSteps = max;
        this.boundary = edge;
        this.xPosition = startX;
        this.yPosition = startY;
        this.maxDistance = 0;
    }
    
    /**
     * Private method to update maxDistance when a step is taken.
     * 
     * @param num1
     *          first number
     * @param num2
     *          second number
     * @return num1 or num2 as an int
     */
    private int max(int num1, int num2) {
        if (num1 > num2) 
            return num1;
        else 
            return num2;
    }
    
    /**
     * Returns the x position of object.
     * 
     * @return xPosition
     */
    public int getX() {
        return this.xPosition;
    }
    
    /**
     * Returns the y position of object.
     * 
     * @return yPositon
     */
    public int getY() {
        return this.yPosition;
    }
    
    /**
     * Simulates an action where the object takes a step 
     * in a random direction (up, down, right or left).
     */
    public void takeStep() {
        Random generator = new Random();
        int randomNum = generator.nextInt(4);

        switch (randomNum) {
        case 0:
            yPosition += 1;
            break;
        case 1:
            yPosition -= 1;
            break;
        case 2: 
            xPosition += 1;
            break;
        case 3:
            xPosition -= 1;
            break;
        }
        
        currentSteps++;
        
        int distanceOrigin;
        if (Math.abs(xPosition) > Math.abs(yPosition))
            distanceOrigin = Math.abs(xPosition);
        else 
            distanceOrigin = Math.abs(yPosition);
        maxDistance = max(maxDistance, distanceOrigin);
    }
    
    /**
     * Getter for maxDistance.
     * 
     * @return maxDistance as an int
     */
    public int getMaxDistance() {
        return maxDistance;
    }
    
    /**
     * A boolean method to determine whether the object has more steps to take before
     * reaching it's maximum steps. 
     * 
     * @return true or false based on condition
     */
    public boolean moreSteps() {
        if (currentSteps < maxSteps) 
            return true;
        else 
            return false;
    }
    
    /**
     * A boolean method to determine whether the object is within it's boundary.
     * 
     * @return true or false based on condition
     */
    public boolean inBounds() {
        if (xPosition <= boundary && yPosition <= boundary) 
            return true;
        else
            return false;
    }
    
    /**
     * Simulates a complete random walk.
     */
    public void walk() {
        while (moreSteps() && inBounds() ) {
            takeStep();
        }
    }
    
    /**
     * toString method.
     */
    public String toString() {
        return ("\nSteps: " + currentSteps + 
                "\nPosition: (" + xPosition + ", " + 
                yPosition + ")");
    }
}
