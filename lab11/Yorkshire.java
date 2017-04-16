package p1;

/**
 * Yorkshire.
 * <p>Extends dog and overrides some methods.</p>
 * 
 * @author A00983479
 * @version 10/04/2017
 */
public class Yorkshire extends Dog {
    private static int breedWeight = 35;
    
    /**
     * Constructor.
     * 
     * @param name
     *          as a String
     */
    public Yorkshire(String name) {
        super(name);
    }
    
    /**
     * Speak dog.
     * 
     * @return statement
     *          as a String
     */
    @Override
    public String speak() {
        return "woof";
    }
    
    public int avgBreedWeight() {
        return breedWeight;
    }
}
