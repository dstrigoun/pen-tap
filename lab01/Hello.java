//***********************************************************
// Hello.java
// Print a Hello, World message. 
// 
// Questions: 
// 2. The error message when deleting one L from the 
//    name of the class reads: "Error: Could not find or 
//    load main class recognizingSyntaxErrors.Hello".
// 3. There is no error message when deleting one L 
//    from "Hello" in the character string because the 
//    string literal does not affect the name of the class 
//    or any other variable. When running the program, it 
//    printed "Helo, World!". 
// 4. The error message when deleting the ending quotation
//    mark at the end of the string reads: "Exception in thread 
//    "main" java.lang.Error: Unresolved compilation problem:
//    String literal is not properly closed by a double-quote".
// 5. There are 4 different errors when deleting the beginning
//    quote in the string literal.
// 6. The error message when deleting the semicolon at the end
//    of the line reads: "Syntax error, insert ";" to complete
//    BlockStatements". 
// *********************************************************
package p1;

/**
 * @author A00983479
 *
 */
public class Hello {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
	}

}
