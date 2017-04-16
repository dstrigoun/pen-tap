package p1;

import java.util.Scanner;
import java.util.Random;

/**
 * Guess.
 * 
 * @author A00983479
 * @version 06/03/2017
 */
public class Guess {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int numToGuess;
        int guess;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        numToGuess = generator.nextInt(100) + 1;
        do {
            System.out.println("Please guess a number between 1 - 100: ");
            guess = scan.nextInt();
            
            if (guess == numToGuess) {
                System.out.println("You guessed it!");
            }
            else if (guess > numToGuess) {
                System.out.println("Too high! Try again.");
            }
            else if (guess < numToGuess) {
                System.out.println("Too low! Try again.");
            }
            else {
                System.out.println("Wrong! Try again.");
            }
        }
        while(guess != numToGuess); 
        scan.close();
    }
}
