package p2;

/**
 * Compare3.
 * 
 * @author A00983479
 * @version 14/03/2017
 */
public class Compare3 {
    /**
     * Constructor for Compare3.
     * 
     * @param com1
     *          first string to compare
     * @param com2
     *          second string to compare
     * @param com3
     *          third string to compare
     * @return com1, com2 or com3 according to conditions
     */
    public static Comparable largest(Comparable com1, 
            Comparable com2, Comparable com3) {
        if (com1.compareTo(com2) > 0 && com1.compareTo(com3) > 0)
            return com1;
        if (com2.compareTo(com3) > 0)
            return com2;
        return com3;
                    
        
    }
}
