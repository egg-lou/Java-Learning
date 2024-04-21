package Academics.OOP.TASK1;
import java.util.*;

public class AssignmentOne {
    enum Choice {
        ROCK, PAPER, SCISSORS
    }
    public static void main(String[] args) {

        Choice playerOneChoice = null;
        Choice playerTwoChoice = null;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
            playerOneChoice = Choice.valueOf(scanner.nextLine().toUpperCase());
        
            System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
            playerTwoChoice = Choice.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
            return;
        } catch (Exception e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
            return;
        }

        String winner = determineWinner(playerOneChoice, playerTwoChoice);
        System.out.println(winner);
    }

    // private static String determineWinner(Choice playerOneChoice, Choice playerTwoChoice) {
    //     if(playerOneChoice == playerTwoChoice) {
    //         return "It's a tie!";
    //     } else if((playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS) ||
    //               (playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.PAPER) ||
    //               (playerOneChoice == Choice.PAPER && playerTwoChoice == Choice.ROCK)) {
    //         return "Player 1 wins!";
    //     } else {
    //         return "Player 2 wins!";
    //     }   
    // }

    private static String determineWinner(Choice playerOneChoice, Choice playerTwoChoice) {
        
        if (playerOneChoice == playerTwoChoice) {
            return "It's a tie!";
        }

        Map<Choice, Choice> winningConditions = new HashMap<>();
        winningConditions.put(Choice.ROCK, Choice.SCISSORS);
        winningConditions.put(Choice.SCISSORS, Choice.PAPER);
        winningConditions.put(Choice.PAPER, Choice.ROCK);

        if (playerOneChoice == winningConditions.get(playerTwoChoice)) {
            return "Winner: Player 1!";
        } else {
            return "Winner: Player 2!";
        }
    }
}