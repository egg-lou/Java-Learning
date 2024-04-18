<<<<<<< HEAD
public class SampleThree {
    public static void main(String[] args) {
        String s1 = "My name is Rupert John";
        System.out.println(s1.contains("Rupert"));

        System.out.println(s1.contains("Devops"));
    }
=======
import java.util.Scanner;

public class SampleThree {

  public static void main(String[] args) {
    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
>>>>>>> a0dfe3d8880e6da7f0adacb0db3242b9c7d5774d
}
