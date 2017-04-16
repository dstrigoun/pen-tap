// ********************************************************
// PlusTest.java
// Demonstrate the different behaviors using the + operator.
//
// Questions:
// c) i. The program printed out "8 plus 5 is 85" for this 
//       statement. The computer reads the line from 
// 		 left to right; As such, it'll read the string literal
//       and then move on to the two numbers that are meant
//       to be added together. Since there's no indication that 
// 		 there's supposed to be an operation, the computer just
// 		 concatenates them to the string literal before it. 
//   ii. The program printed out "8 plus 5 is 13" for this 
//   	 statement. This time, the statement has a pair of 
//   	 parentheses surrounding the operation. This means that 
//  	 the computer recognizes that it's meant to be added before
// 		 being concatenated to the string literal. 
//  iii. The program printed out "13 equals 8 plus 5" for this
// 		 statement. As mentioned earlier, the computer will read
// 		 the statement from left to right, which means that it 
// 		 finished the operation before moving on to concatenate it
// 		 to the string. 
// d) You can move the "55" to the next line and it would still
//    be read as two characters to be concatenated to the string 
//    literals. 
//***********************************************************
package p1;

/**
 * @author A00983479
 *
 */
public class PlusTest {
	
	public static void main(String[] args) {
		
		System.out.println("This is a long string that is the " +
							"concatenation of two shorter strings.");
		System.out.println ("The first computer was invented about " + 55 +
							" years ago.");
		System.out.println ("8 plus 5 is " + 8 + 5);
		System.out.println ("8 plus 5 is " + (8 + 5)) ;
		System.out.println (8 + 5 + " equals 8 plus 5.");
		
	}

}
