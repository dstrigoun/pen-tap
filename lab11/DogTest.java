package p1;

public class DogTest {
    public static void main(String[] args) {
        Dog yorkie = new Yorkshire("Sammy");
        Dog lab = new Labrador("Georger", "brown");
        
        System.out.println(yorkie.getName() + " says " + yorkie.speak());
        System.out.println(yorkie.getName() + " weighs " + yorkie.avgBreedWeight());
        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(lab.getName() + " weighs " + lab.avgBreedWeight());
    }
}
