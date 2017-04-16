package p1;

/**
 * StringManips.
 * @author A00983479	
 * @version 01/02/2017
 */
import java.util.Scanner;

public class StringManips {
	/**
	 * Drives the program.
	 * @param args command line args
	 */
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); 
		String phrase;
		int phraseLength;
		int middleIndex;
		String firstHalf;
		String secondHalf;
		String switchedPhrase;
		String middle3;
		String city;
		String state;
		
		System.out.print("Please enter a sentence: ");
		phrase = scan.nextLine();
		
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;
		
		firstHalf = phrase.substring(0, middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);
		middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
		
		switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = switchedPhrase.replaceAll(" ", "*");
		//city = city.toLowerCase();
		//state = state.toUpperCase();
		
		System.out.println();
		System.out.println ("Original phrase: " + phrase);
		System.out.println ("Length of the phrase: " + phraseLength +
							" characters");
		System.out.println ("Index of the middle: " + middleIndex);
		System.out.println ("Character at the middle index: " +
							phrase.charAt(middleIndex));
		System.out.println ("Switched phrase: " + switchedPhrase);
		System.out.println ("Middle 3 letters: " + middle3);
		System.out.println();
		
		System.out.println ("Please enter your city: ");
		city = scan.next();
		System.out.println("Please enter your state: ");
		state = scan.next();
		System.out.println (state.toUpperCase() + city.toLowerCase() + 
							state.toUpperCase());
		System.out.println();
		
		scan.close();
	}

}
