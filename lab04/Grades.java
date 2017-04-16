package p1;

/**
 * Grades.
 * 
 * @author A00983479	
 * @version 05/02/2017
 */
public class Grades {
	/**
	 * Drives the program.
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args){
		Student student1;
		Student student2;
		
		student1 = new Student("Mary");
		student2 = new Student("Mike");
		
		student1.getName();
		student1.inputGrades();
	    student1.getAverage();
	    System.out.println("Student 1: " + student1);
	    System.out.println("Student 1's average: " + student1.getAverage());
	    
	    System.out.println();
	    
	    student2.getName();
	    student2.inputGrades();
		student2.getAverage();
		System.out.println("Student 2: " + student2);
	    System.out.println("Student 2's average: " + student2.getAverage());
		
	}

}
