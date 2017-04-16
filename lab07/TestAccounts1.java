package p4;

import java.util.Scanner;

/**
 * TestAccount.
 * 
 * @author A00983479
 * @version 07/03/2017
 */
public class TestAccounts1 {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        Account testAcct;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            testAcct = new Account(100, "Name" + i);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " + Account.getNumAccounts() 
                        + " accounts");
        }
        
        scan.close();
    }
}
