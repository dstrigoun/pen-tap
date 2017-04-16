package p1;

import java.util.ArrayList;
import java.util.Scanner;

import java.text.NumberFormat;

/**
 * Shop.
 * 
 * @author A00983479
 * @version 02/03/2017
 */
public class Shop {
    /**
     * Drives the program.
     * 
     * @param args
     *        Command line arguments
     */
    public static void main (String[] args){
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        ArrayList<Item> cart = new ArrayList<Item>();
        
        String keepShopping = "y";
        
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();
            
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            
            scan.nextLine();
            
            cart.add(item = new Item(itemName, itemPrice, quantity));
        
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            
            System.out.println();
        }
        while (keepShopping.equalsIgnoreCase("y"));
        

        for (int i = 0; i < cart.size(); i++){
            System.out.println("Your item: " + cart.get(i).getName());
            System.out.println("Unit price and quantity: " + fmt.format(cart.get(i).getPrice()) 
                    + " for " + cart.get(i).getQuantity());
            System.out.println("Total Price: " + fmt.format(cart.get(i).getPrice() 
                    * cart.get(i).getQuantity()));
        }
        
        scan.close();
    }
}
