package p1;

import java.text.NumberFormat;

/**
 * Item.
 * 
 * @author A00983479
 * @version 02/03/2017
 */
public class Item {
    private String name;
    private double price;
    private int quantity;
    /**
     * Item constructor.
     * 
     * @param itemName
     *                name
     * @param itemPrice
     *                price
     * @param numPurchased
     *                quantity
     */
    public Item (String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    
    /**
     * toString method
     */
    public String toString () {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price*quantity));
    }
    
    /**
     * 
     * @return price as a double
     */
    public double getPrice() {
        return price;
    }

    /**
     * 
     * @return name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return quantity as an int
     */
    public int getQuantity() {
        return quantity; 
    }
}


