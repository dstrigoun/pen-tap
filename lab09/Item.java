package p4;

import java.text.NumberFormat;

/**
 * Item.
 * 
 * @author A00983479
 * @version 27/03/2017
 */
public class Item {
    private String name;
    private double price;
    private int quantity;
    
    /**
     * Constructs an Item.
     * 
     * @param itemName
     *          name of the item
     * @param itemPrice
     *          price of the item
     * @param numPurchased
     *          how many have been purchased
     */
    public Item (String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice; 
        quantity = numPurchased;
    }
    
    
    /**
     * Returns the price.
     * 
     * @return price as a double
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns the name.
     * 
     * @return name as a String
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the amount purchased.
     * 
     * @return quantity as an int
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Sets toString method.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return (name +"\t" + fmt.format(price) + "\t" + quantity + "\t"
               + fmt.format(price*quantity));
    }
    
}
