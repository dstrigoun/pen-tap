package p2;
//why salesperson 0 that's stupid
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Sales.
 * 
 * @author A00983479
 * @version 27/03/2017
 */
public class Sales {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int SALESPEOPLE;
        int[] sales;
        int sum;
        int maxPerson = 0; 
        int minPerson = 0;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Please enter how many salespeople there are: ");
        SALESPEOPLE = scan.nextInt();
        
        sales = new int[SALESPEOPLE];
        
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) +
                            ": ");
            sales[i] = scan.nextInt();
        }
        
        System.out.println("\n  Salesperson Sales");
        System.out.println("--------------------- ");
        sum = 0;
        int max = sales[0];
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            System.out.println("    " + (i + 1) + "\t" + fmt.format(sales[i]));
            sum += sales[i];   
            
            if (sales[i] > max) {
                max = sales[i];
                maxPerson = (i + 1);
            }
            if (sales[i] < min) {
                min = sales[i];
                minPerson = (i + 1);
            }
        }
        
        System.out.println("\nTotal sales: " + fmt.format(sum));
        System.out.println("Average sales: " + fmt.format(sum / SALESPEOPLE));
        System.out.println("\nSalesperson " + maxPerson + " had the highest sale with " + fmt.format(max));
        System.out.println("Salesperson " + minPerson + " had the lowest sale with " + fmt.format(min));
        
        scan.close();
    }
}
