package p1;

import java.util.Scanner;

/**
 * Student.
 * 
 * @author A00983479
 * @version 05/02/2017
 */
public class Student {
	private String name;
	private int test1;
	private int test2;
	private Scanner scan;
	
	/**
	 * Constructs an object of type student.
	 * @param studentName
	 *              Name of student.
	 */
	public Student (String studentName){
		name = studentName;
	}
	
	/**
	 * Scans and sets for test scores from user input.
	 */
	public void inputGrades(){
		scan = new Scanner(System.in);

		System.out.println("Please enter " + name + "'s first test score: ");
		test1 = scan.nextInt();
		System.out.println("Please enter " + name + "'s second test score: ");
		test2 = scan.nextInt();
	}
	
	/**
	 * Returns the student's average.
	 * @return average as a double
	 */
	public double getAverage(){
		return (test1 + test2) / 2.0;
	}
	
	/**
	 * Returns the student's name.
	 * @return name as a String
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return description as a String
	 */
	public String toString(){
		return ("Name = " + name + "\t" 
	            + "Test 1 = " + test1 + "\t" 
				+ "Test 2 = " + test2);
	}
	
}
