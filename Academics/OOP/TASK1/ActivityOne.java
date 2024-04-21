package Academics.OOP.TASK1;
public class ActivityOne {
    public static void main(String[] args) {
        String firstName = "Alenere";
        String secondName = "David";
        String gender = "she";
        String drink = "coffee";

        StringBuilder message = new StringBuilder();
        message.append(firstName).append(", the friendly neighbor, waved at ")
               .append(secondName).append(" as ").append(gender)
               .append(" walked by \n").append(secondName).append("'s house. ")
               .append(secondName).append(" smiled back and invited ")
               .append(firstName).append(" in for a\ncup of ").append(drink).append(".");

        System.out.println(message.toString());
    }
}