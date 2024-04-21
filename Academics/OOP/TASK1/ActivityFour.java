package Academics.OOP.TASK1;
import java.util.*;

public class ActivityFour {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            String result = checkEvenOdd(number);
            System.out.println(result);       
        } catch (InputMismatchException e) {
           System.out.println("Invalid input. Please enter a number.");
       }
    }

    private static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "The number is even" : "The number is odd";
    }
}
