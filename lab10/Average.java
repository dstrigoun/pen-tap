package p1;

/**
 * Average. 
 * <p>Prints the strings given at command line.</p>
 * 
 * @author A00983479
 * @version 03/04/2017
 */
public class Average {
    /**
     * Drives the program. 
     * 
     * @param args
     *          command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
                sum += Integer.parseInt(args[i]);
            }
        }
        System.out.println();
        System.out.println("Average: " + (sum/args.length));
    }
}
