package Academics.OOP.TASK1;
import java.util.*;

public class AcitivityFour {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            String result = (number % 2 == 0) ? "The number is even" : "The number is odd";
            System.out.println(result);       
        } catch (InputMismatchException e) {
           System.out.println("Invalid input. Please enter a number.");
       } finally {
            System.out.println("Thank you for using the program");
       }
    }
}
