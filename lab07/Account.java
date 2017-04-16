package p4;

import java.util.Random;

/**
 * Account.
 * 
 * @author A00983479
 * @version 07/03/2017
 */
public class Account {
    /**
     * The current amount of money in owner's account.
     */
    private double balance;
    
    /**
     * Name of the person with the account.
     */
    private String name;
    
    /**
     * A unique long to identify the user's account.
     */
    private long acctNum;
    
    /**
     * An integer to keep track of how many bank accounts exist.
     */
    private static int numAccounts = 0;
    
    
    /**
     * Account constructor that accepts 3 parameters.
     * 
     * @param initBal
     *          balance
     * @param owner
     *          name
     * @param number
     *          acctNum
     */
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        
        numAccounts++;
    }
    
    /**
     * Second constructor that accepts 2 parameters.S
     * 
     * @param initBal
     *          balance
     * @param owner
     *          name
     */
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        
        Random generator = new Random();
        acctNum = generator.nextLong();
        if (acctNum < 0) {
            acctNum *= -1;
        }
        
        numAccounts++;
    }
    
    /**
     * Third constructor that accepts one parameter.
     * 
     * @param owner
     *          name
     */
    public Account(String owner) {
        name = owner;
        
        balance = 0;
        
        Random generator = new Random();
        acctNum = generator.nextLong();
        if (acctNum < 0) {
            acctNum *= -1;
        }
        
        numAccounts++;
    }
    
    /**
     * Subtracts an amount from user's balance.
     * 
     * @param amount
     * @param fee
     */
    public void withdraw(double amount, int fee) {
        if (balance >= amount) 
            balance -= (amount + fee);
        else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Allows user to deposit money into their balance.
     * 
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
     * Returns user's balance.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Returns the total amount of bank accounts.
     * 
     * @return numAccounts as an int
     */
    public static int getNumAccounts() {
        return numAccounts;
    }
    
    /**
     * Closes an account. (account number still exists)
     */
    public void close() {
        balance = 0;
        name = "CLOSED";
        
        numAccounts--;
    }
    
    /**
     * Consolidates two accounts with the same value for name.
     * 
     * @param acct1
     * @param acct2
     * @return acct3 as an Account        
     */
    public static Account consolidate(Account acct1, Account acct2) {
        Random generator = new Random();
        
        if (acct1.name.equalsIgnoreCase(acct2.name) && acct1.acctNum != acct2.acctNum) {
                    Account acct3 = new Account(0, acct1.name);
                    acct3.balance = acct1.getBalance() + acct2.getBalance();
                    acct3.acctNum = generator.nextLong();
                    if (acct3.acctNum < 0) {
                        acct3.acctNum *= -1;
                    }
                    
                    acct1.close();
                    acct2.close();
                    return acct3;
                }
        else {
            System.out.println("Cannot consolidate.");
            return null;
        }
    }
    
    /**
     * toString method.
     */
    public String toString() {
        return ("\n\tName: " + name +
                "\n\tAccount Number: " + acctNum + 
                "\n\tBalance: " + balance);
    }
}
