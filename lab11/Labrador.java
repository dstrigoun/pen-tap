package p1;

public class Labrador extends Dog {
    @SuppressWarnings("unused")
    private String color;
    private static int breedWeight = 75;
    
    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }
    
    /**
     * speak method.
     * 
     * @return String
     */
    @Override
    public String speak() {
        return "WOOF!";
    }
    
    
    public int avgBreedWeight() {
        return breedWeight;
    }

}
