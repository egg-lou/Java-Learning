package Academics.OOP.TASK1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActivityThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {            
            System.out.println("Input the lenght of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Input the width of the rectangle: ");
            double width = scanner.nextDouble();
            
            double perimeter = perimeter(length, width);
            
            System.out.println("The length of the rectangle is: " + length);
            System.out.println("The width of the rectangle is: " + width);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number");
        } finally {
            System.out.println("Thank you for using the program");   
            scanner.close();
        }
    }    

    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }
}
