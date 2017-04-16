package p1;
//days in month
//ask someone in the morning to explain?
import java.util.Scanner;

/**
 * Dates. 
 * 
 * @author A00983479
 * @version 02/03/2017
 */
public class Dates {
    /**
     * Drives the program.
     * 
     * @param args
     *        Command line arguments
     */
    public static void main(String[] args) {
        int month, day, year;
        int daysInMonth;
        boolean monthValid, yearValid, dayValid;
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program will test to see if a date is valid in the "
                + "second millenium.");
        System.out.println("Please enter a month, day and year in number form (xx xx xxxx): ");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        
        monthValid = false;
        daysInMonth = 0;
        if (month <= 12 && month >= 1) { 
            monthValid = true; 
        }
        
        yearValid = false;
        if (year <= 1999 && year >= 1000) {
            yearValid = true;
        }
        
        if (year % 4 == 0) 
            leapYear = true;
        else if (year % 100 == 0)
                leapYear = false;
        else if (year % 400 == 0)
                leapYear = true;
        else 
                leapYear = false;
        
        dayValid = false;
        if (day <= 31 && day >= 1) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31;
                dayValid = true;
            }
            else if (month == 2 && leapYear) {
                daysInMonth = 29;
                dayValid = true;
            }
            else if (month == 2 && !leapYear) {
                daysInMonth = 28;
                dayValid = true;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
                dayValid = true;
            }
        }   
        else {
            daysInMonth = 0;
            dayValid = false;
        }
             
        System.out.println("That date is" + ((yearValid == true && monthValid == true && dayValid == true) ? (" ") :
            (" not ")) +"valid.");
        if (yearValid == true && monthValid == true && dayValid == true)
            System.out.println((leapYear == true) ? ("This is a leap year.") : ("This is not a leap year."));
        else
            System.out.println();
        
        scan.close();
    }      
}
