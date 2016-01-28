import Compare.CompareChoices;
import Computer.ComputerChoice;
import Player.PlayerChoice;

import java.util.Scanner;


/**
 * Created by igor on 27.01.16.
 */
public class Test {
    public static void main(String[] args) {
       //456456q
	System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        PlayerChoice player1 = new PlayerChoice();
        player1.setPlayerChoise(player);
        System.out.println("Player choice = " + player1.getPlayerChoise());
        CompareChoices compareChoices = new CompareChoices();
        System.out.println(compareChoices.getWinner());
    }
}

