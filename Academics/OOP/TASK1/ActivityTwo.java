package Academics.OOP.TASK1;
import java.util.*;

public class ActivityTwo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the temperature you want to convert: eg(54C, 86F): ");
            String temperature = scanner.nextLine();

            convertTemperature(temperature);

        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }

    private static void convertTemperature(String temperature) {
        int length = temperature.length();
        double temp = Double.parseDouble(temperature.substring(0, length - 1));
        char scale = Character.toUpperCase(temperature.charAt(length - 1));

        if (scale == 'C') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + String.format("%.2f", fahrenheit) + "F");
        } else if (scale == 'F') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius is: " + String.format("%.2f", celsius) + "C");
        } else {
            System.out.println("Invalid input");
        }
    }
}
