
package Academics.OOP.TASK2;
import java.util.*;

public class AssignmentTwo {
    enum Choice {
        ROCK, PAPER, SCISSORS
    }
   public static void main(String[] args) {
    String playAgain;
    Scanner scanner = new Scanner(System.in);

        do {
            Choice playerOneChoice = null;
            Choice playerTwoChoice = null;

            try {
                System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
                playerOneChoice = Choice.valueOf(scanner.nextLine().toUpperCase());

                System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
                playerTwoChoice = Choice.valueOf(scanner.nextLine().toUpperCase());

                String winner = determineWinner(playerOneChoice, playerTwoChoice);
                System.out.println(winner);

                System.out.print("Do you want to play again? [Y]Yes or [N]No: ");
                playAgain = scanner.nextLine().toUpperCase();

                while(!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.print("Invalid choice. Please enter [Y]Yes or [N]No: ");
                    playAgain = scanner.nextLine().toUpperCase();
                }

                if(playAgain.equals("N")) {
                    System.out.println("Thanks for playing!");
                    scanner.close();
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                return;
            } catch (Exception e) {
                System.out.println("An error occurred while reading input: " + e.getMessage());
                return;
            }
        } while(playAgain.equals("Y"));
        } 
        
        private static String determineWinner(Choice playerOneChoice, Choice playerTwoChoice) {
            if(playerOneChoice == playerTwoChoice) {
                return "It's a tie!";
            } else if((playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS) ||
            (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.PAPER) ||
                  (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.ROCK)) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }   
    }
}