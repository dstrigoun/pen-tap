package p1;

import java.util.Random;

/**
 * Account.
 * 
 * @author A00983479
 * @version 09/03/2017
 */
public class Account {
    private double balance;
    private String name;
    private long acctNum;
    
    /**
     * Constructs an empty Account with an initial balance,
     * owner's name and account number.
     * 
     * @param initBal
     *          balance of Account
     * @param owner
     *          owner of Account
     * @param number
     *          account number
     */
    public Account(double initBal, String owner, long number) {
        this.balance = initBal;
        this.name = owner;
        this.acctNum = number;
    }
    
    /**
     * Constructs an empty Account with an initial balance
     * and the owner's name.
     * 
     * @param initBal
     *          balance of Account
     * @param owner
     *          owner of Account
     */
    public Account(double initBal, String owner) {
        this.balance = initBal;
        this.name = owner;
        
        Random generator = new Random();
        this.acctNum = generator.nextLong();
        if (acctNum < 0)
            acctNum *= -1;
    }
    
    /**
     * Constructs an empty Account with the owner's name.
     * 
     * @param owner
     *          owner of Account
     */
    public Account(String owner) {
        this.balance = 0;
        this.name = owner;
        
        Random generator = new Random();
        this.acctNum = generator.nextLong();
        if (acctNum < 0)
            acctNum *= -1;
    }
    
    /**
     * Subtracts an amount from owner's account.
     * 
     * @param amount
     *          amount to be withdrawn
     */
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    
    /**
     * Subtracts an amount from owner's account and charges
     * a fee.
     * 
     * @param amount
     *          amount to be withdrawn
     * @param fee
     *          additional amount charged to owner
     */
    public void withdraw(double amount, int fee) {
        if (balance >= (amount + fee))
            balance -= (amount + fee);
        else 
            System.out.println("Insufficient funds.");
    }
    
    /**
     * Adds an amount to the owner's account.
     * 
     * @param amount
     *          amount to be withdrawn
     */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
     * Returns balance of owner's account.
     * 
     * @return balance as a double
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * toString method for Account.
     */
    public String toString() {
        return ("Name: " + name + 
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance);     
    }
}
