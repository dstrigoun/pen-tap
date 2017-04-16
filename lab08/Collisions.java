package p3;

/**
 * Collisions.
 * 
 * @author A00983479
 * @version 23/03/2017
 */
public class Collisions {
    /**
     * Drives the program. 
     * 
     * @param args
     *          Command line arguments
     */
    public static void main(String[] args) {
        int boundary = 2_000_000;
        int maxSteps = 100_000;
        int collide = 0;
        
        RandomWalk particle1 = new RandomWalk(maxSteps, boundary, -3, 0);
        RandomWalk particle2 = new RandomWalk(maxSteps, boundary, 3, 0);
        
        for (int i = 0; i < maxSteps; i++) {
            particle1.takeStep();
            particle2.takeStep();
            
            if (Collisions.samePosition(particle1, particle2)) 
                collide++;
        }
        
        System.out.println("The two particles collided " + collide +
                           ((collide == 1) ? (" time.") : (" times.")));
    }
    /**
     * Determines whether the particles are in the same position.
     * 
     * @param p1
     *          first particle
     * @param p2
     *          second particle
     * @return true or false based on condition
     */
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        if (p1.getX() == p2.getX() &&
            p1.getY() == p2.getY()) {
            return true;
        } else 
            return false;
    }
}
