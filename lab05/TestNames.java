package p1;

import java.util.Scanner;

/**
 * TestNames.
 * 
 * @author Doosha
 * @version 12/02/2017
 */
public class TestNames {
    /**
     * Drives the program.
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 3-part name: ");
        String firstName = scan.next();
        String middleName = scan.next();
        String lastName = scan.next();
        
        Name fullName1 = new Name(firstName, middleName, lastName);
        
        System.out.println("----First Person----");
        System.out.println("Full name: " + fullName1.firstMiddleLast());
        System.out.println("Reverse name: " + fullName1.lastFirstMiddle());
        System.out.println("Initials: " + fullName1.initials());
        System.out.println("Length: " + fullName1.length());
        
        System.out.println();
        
        System.out.println("Please enter a 3-part name: ");
        firstName = scan.next();
        middleName = scan.next();
        lastName = scan.next();
        
        Name fullName2 = new Name(firstName, middleName, lastName);
        
        System.out.println();

        System.out.println("----Second Person----");
        System.out.println("Full name: " + fullName2.firstMiddleLast());
        System.out.println("Reverse name: " + fullName2.lastFirstMiddle());
        System.out.println("Initials: " + fullName2.initials());
        System.out.println("Length: " + fullName2.length());
        
        System.out.println();
        if (fullName1.equals(fullName2)) { 
           System.out.println("The names are the same.");
        } else { 
           System.out.println("The names are not the same.");
        }
        
        scan.close();
    }
}
