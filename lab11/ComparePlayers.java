package p2;

import java.util.Scanner;

public class ComparePlayers {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        
        Scanner scan = new Scanner(System.in);
        
        player1.readPlayer();

        player2.readPlayer();
        
        if (player1.equals(player2)) {
            System.out.println("players are equal");
        } else {
            System.out.println("players are not equal");
        }
        //compare player1 to player2 and print a message 
        //saying whether they are equal
        scan.close();
    }
}
