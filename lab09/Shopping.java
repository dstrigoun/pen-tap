package p4;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;
        String keepShopping = "y";
        
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Name of the item: ");
            name = scan.next();
            System.out.println("Price of the item ");
            price = scan.nextDouble();
            System.out.println("Quantity of item: ");
            quantity = scan.nextInt();
            
            Item item = new Item(name, price, quantity);
            
            System.out.println(item);
            
            ShoppingCart cart = new ShoppingCart();
            
            cart.addToCart(name, price, quantity);
            
            System.out.println(cart);
            
            
            System.out.println("Continue Shopping? (y/n)");
            keepShopping = scan.next();
        }
        while (keepShopping == "y");
        
        System.out.println("Thank you for shopping at CST Grocery Store!");
        System.out.println("Please pay: " );
        
        scan.close();
    }
}
