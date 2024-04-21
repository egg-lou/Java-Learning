package Academics.OOP.TASK1;

public class AssignmentOne {
    public static void main(String[] args) {
        String playerOneChoice = "";
        String playerTwoChoice = "";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Player One's choice: ");
            playerOneChoice = scanner.nextLine();

            System.out.print("Enter Player Two's choice: ");
            playerTwoChoice = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
            return;
        }
        
        System.out.println("Player One chose: " + playerOneChoice);
        System.out.println("Player Two chose: " + playerTwoChoice);

        String winner = determineWinner(playerOneChoice, playerTwoChoice);
        System.out.println(winner);
    }

    private static String determineWinner(String playerOneChoice, String)
    
}
