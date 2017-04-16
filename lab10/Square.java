package p3;

import java.util.Scanner;

/**
 * Square.
 * 
 * @author A00983479
 * @version 05/04/2017
 */
public class Square {
    int[][] square;
    
    /**
     * Sets up the parameters of a Square.
     * 
     * @param size
     *          dimensions of square
     */
    public Square(int size) {
        square = new int[size][size];
    }
    
    /**
     * Calculates and returns sum of a row.
     * 
     * @param row
     *          row of square
     * @return sum as an int
     */
    public int sumRow(int row) {
        int sum = 0;
        for (row = 0; row < square.length; row++) {
            sum += square[row][0];
        }
        return sum;
    }
    
    /**
     * Calculates and returns sum of a column.
     * 
     * @param col
     *          column of square
     * @return sum as an int
     */
    public int sumCol(int col) {
        int sum = 0;
        for (col = 0; col < square.length; col++) {
            sum += square[0][col];
        }
        return sum;
    }
    
    /**
     * Calculates and returns sum of the main diagonal.
     * 
     * @return sum as an int
     */
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
                sum += square[i][i];
        }
        return sum;
    }
    
    /**
     * Calculates and returns sum of the opposite diagonal.
     * 
     * @return sum as an int
     */
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = square.length - 1; i >= 0; i--) {
            sum += square[i][i];
    }
        return sum;
    }
    
    /**
     * Returns a boolean saying whether square is magic.
     * 
     * @return false
     */
    public boolean magic() {
        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) == sumCol(i) && sumRow(i) == sumMainDiag() && sumRow(i)== sumOtherDiag()) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Reads input from input stream and sets square array.
     * 
     * @param scan
     *          input from text file
     */
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }
    
    /**
     * Prints square array.
     */
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print("\t" + square[row][col]);
            }
            System.out.println();
        }
    }
}
