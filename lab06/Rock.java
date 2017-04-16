package p1;

import java.util.Scanner;
import java.util.Random;

/**
 * Rock.
 * 
 * @author A00983479
 * @version 02/03/2017
 */
public class Rock {
    /**
     * Drives the program.
     * 
     * @param args
     *        Command line arguments
     */
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = null;
        int computerInt;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        String playAgain = "y";
        do {
        System.out.println("--------------ROCK PAPER SCISSORS--------------------");
        System.out.print("Please enter R, P, or S to play Rock Paper Scissors: ");
        personPlay = scan.next();
 
        
        personPlay = personPlay.toUpperCase();

        computerInt = generator.nextInt(2);
        
        switch (computerInt){
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
        }

        System.out.println("Computer played: " + computerPlay);
        
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else 
                System.out.println("Paper muffles rock. Computer wins!!");
        else if (personPlay.equals("P"))
            if (computerPlay.equals("S"))
                System.out.println("Scissors cut paper. Computer wins!!");
            else
                System.out.println("Paper muffles rock. You win!!");
        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cut paper. You win!!");
            else
                System.out.println("Rock crushes scissors. Computer wins!!");
        else
            System.out.println("You didn't enter R, P or S. Please try again.");
        
        System.out.println("Try again? y/n: ");
        playAgain = scan.next();
        } while(playAgain == "y");
        
        scan.close();
    }
}
