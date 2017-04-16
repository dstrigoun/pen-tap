package p2;

import java.util.Scanner;

/**
 * Count.
 * 
 * @author A00983479
 * @version 06/03/2017
 */
public class Count {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        String phrase;
        int countBlank;
        int length;
        char ch;
        int countA;
        int countE;
        int countS;
        int countT;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        
        System.out.print("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();
        
        countBlank = 0;
        countA = 0;
        countE = 0;
        countS = 0;
        countT = 0;
        
        for (int i = 1; i < length; ++i) {
            ch = phrase.charAt(i);
            switch (ch) {
            case ' ':
                countBlank++;
                break;
            case 'a':
            case 'A':
                countA++;
                break;
            case 'e':
            case 'E':
                countE++;
                break;
            case 's':
            case 'S':
                countS++;
                break;
            case 't':
            case 'T':
                countT++;
                break;
            }
        }
        
        System.out.println();
        System.out.println("Number of blank spaces: " + countBlank);
        System.out.println("Number of A's: " + countA);
        System.out.println("Number of E's: " + countE);
        System.out.println("Number of S's: " + countS);
        System.out.println("Number of T's: " + countT);
        
        scan.close();
    }
}
