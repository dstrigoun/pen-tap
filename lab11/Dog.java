package p1;

/**
 * Dog. 
 * <p>Abstract class that holds dog's name and makes it speak.</p>
 * 
 * @author A00983479
 * @version 10/04/2017
 */
public abstract class Dog {
    protected String name;
    
    /**
     * Constructor.
     * 
     * @param name
     *          name of the dog
     */
    public Dog(String name) {
        this.name = name;
    }
    
    /**
     * Returns the dog name.
     * 
     * @return name
     *          as a String
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns a string.
     * 
     * @return statement
     *          as a String
     */
    public String speak() {
        return "Woof";
    }
    
    /**
     * Abstract method for the average weight of a breed.
     */
    public abstract int avgBreedWeight();
}
