package Academics.OOP.TASK2;
import java.util.*;

public class AssignmentThree {
   public static void main(String[] args) {
    ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        System.out.println("Even numbers between 0 and 50: " + evenNumbers);
   } 
}
