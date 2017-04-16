package p1;

/**
 * Cards.
 * 
 * @author A00983479
 * @version 06/02/2017
 */
public class Cards {
	enum Rank {
		blank, 
		ace, 
		two, 
		three, 
		four, 
		five, 
		six, 
		seven,  
		eight, 
		nine, 
		ten, 
		jack, 
		queen, 
		king}
	
	/**
	 * Drives the program.
	 * 
	 * @param args
	 * 			  Command line arguments
	 */
	public static void main(String[] args){
		Rank highCard, faceCard;
		Rank card1, card2;
		int card1Val, card2Val;
		
		highCard = Rank.ace;
		faceCard = Rank.jack;
		card1 = Rank.four;
		card2 = Rank.two;
		
		card1Val = card1.ordinal();
		card2Val = card2.ordinal();
		
		System.out.println("A blackjack hand: " + highCard 
							+ " and " + faceCard);
		System.out.println("A two card hand: " + card1 + " and " + card2);
		System.out.println("Hand value: " + (card1Val + card2Val));
	}
	
}
