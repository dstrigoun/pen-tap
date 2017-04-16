package p3;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

/**
 * SquareTest. 
 * 
 * @author A00983479
 * @version 05/04/2017
 */
public class SquareTest {
    /**
     * Drives the program. 
     * 
     * @param args
     *          command line arguments
     * @throws IOException
     *          throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicData"));
        
        int count = 1;
        int size = scan.nextInt();
        
        while (size != -1) {
            Square magicSquare = new Square(size);

            magicSquare.readSquare(scan);
            System.out.println("\nSquare " + count + " ******************************************************************");
            magicSquare.printSquare();
            
            System.out.println("\nSum of the rows: ");
            for (int i = 1; i <= size; i++) {
                System.out.println("\tSum of row " + i + ": " + magicSquare.sumRow(i));
            }
            System.out.println();
            System.out.println("Sum of the columns: ");
            for (int i = 1; i <= size; i++) {
                System.out.println("\tSum of column " + i + ": " + magicSquare.sumCol(i));
            }
            System.out.println();
            System.out.println("Sum of the main diagonal (top left to bottom right): " + magicSquare.sumMainDiag());
            System.out.println();
            System.out.println("Sum of the opposite diagonal (bottom left to top right): " + magicSquare.sumOtherDiag());
            System.out.println();
            if (magicSquare.magic()) {
                System.out.println("This is a magice square.");
            }
            else {
                System.out.println("This is not a magic square.");
            }
            System.out.println("***************************************************************************");
            count++;
            size = scan.nextInt();
        }
        
        scan.close();
    }
}
