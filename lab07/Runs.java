package p3;

/**
 * Runs.
 * 
 * @author A00983479
 * @version 07/03/2017
 */
public class Runs {
    /**
     * Drives the program.
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        final int FLIPS = 100;
        
        int currentRun = 0;
        int maxRun = 0;
        
        Coin coin = new Coin();

        for (int i = 0; i < FLIPS; i++) {
            coin.flip();
            
            System.out.println(coin);

            if (coin.isHeads()) {
                currentRun++;
                if (maxRun < currentRun) {
                    maxRun = currentRun;
                }
            }
            else {
                currentRun = 0;
            }
        }
        System.out.println();
        System.out.println("Largest run of Heads: " + maxRun);
    }
}
