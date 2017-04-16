package p4;
//have no idea what to put in addToCart
//also, where put increaseSize???
import java.text.NumberFormat;

/**
 * ShoppingCart.
 * 
 * @author A00983479
 * @version 27/03/2017
 */
public class ShoppingCart {
    private int itemCount;
    private double totalPrice;
    private int capacity;
    private Item[] cart;
     
    /**
     * Constructs a ShoppingCart.
     */
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    
    /**
     * Adds an item to the Shopping Cart.
     * 
     * @param itemName
     *          name of the item
     * @param price
     *          price of the item
     * @param quantity
     *          amount of each item
     */
    public void addToCart(String itemName, double price, int quantity) {
        
    }
    
    /**
     * Sets toString method.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        
        for (int i = 0; i < itemCount; i++)
            contents += cart[i].toString() + "\n";
        
        contents+= "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        
        return contents;
    }
    
    /**
     * Expands the array by 3.
     */
    private void increaseSize() {
        Item[] temp = new Item[cart.length + 3];

        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
    }
}
