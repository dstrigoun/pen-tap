package p4;

import java.util.Scanner;

/**
 * TestAccounts2.
 * 
 * @author A00983479
 * @version 07/03/2017
 */
public class TestAccounts2 {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        String name1, name2, name3;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the name of the first account holder: ");
        name1 = scan.next();
        Account acct1 = new Account(100, name1);
        
        System.out.println("Please enter the name of the second account holder: ");
        name2 = scan.next();
        Account acct2 = new Account(100, name2);
        
        System.out.println("Please enter the name of the third account holder: ");
        name3 = scan.next();
        Account acct3 = new Account(100, name3);
        
        System.out.println("\nFirst account: " + acct1);
        System.out.println("\nSecond account: " + acct2);
        System.out.println("\nThird account: " + acct3);
        System.out.println();
        
        System.out.println(name1 + "'s account deleted.");
        acct1.close();
        System.out.println("Consolidating " + name2 + " and " + name3);
        Account newAccount = Account.consolidate(acct2, acct3);
        
        System.out.println("\nFirst account: " + acct1);
        System.out.println("\nSecond account: " + acct2);
        System.out.println("\nThird account: " + acct3);
        System.out.println("\nConsolidated account: " + newAccount);
        
        scan.close();
    }
}
