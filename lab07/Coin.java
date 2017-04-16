package p3;

/**
 * Coin.
 * 
 * @author A00983479
 * @version 06/03/2017
 */
public class Coin {
    /**
     * The heads face of the coin.
     */
    public final int HEADS = 0;
    
    /**
     * The tails face of the coin.
     */
    public final int TAILS = 1;
    
    /**
     * The coin's current state.
     */
    private int face;
    
    
    /**
     * Sets up the coin by flipping it initially.
     */
    public Coin() {
        flip();
    }
    
    /**
     * Flips the coin by randomly choosing a face.
     */
    public void flip() {
        /* 
         * Math.random() gives you a float between 0.0001 and 0.9999.
         * Take that float and multiply by 2.
         * Truncate the fraction to make the output 0 or 1.
         */
        face = (int)(Math.random() * 2);
        /* 
         * --------Alternate Method--------
         * import Random class
         * Random generator = new Random();
         * face = generator.nextInt(2);
         */
    }
    
    /**
     * Returns true if the current face of the coin is heads.
     * 
     * @return true as a boolean
     */
    public boolean isHeads() {
        return (face == HEADS);
    }
    
    /**
     * Returns the current face of the face of the coin as a String.
     */
    public String toString() {
        String faceName;
        
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }
}
