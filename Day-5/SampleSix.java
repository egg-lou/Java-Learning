<<<<<<< HEAD
import java.util.*;

public class SampleSix {
    public static void main(String[] args) {
        String text = new String("Hello, My name is sir eddie");

        String[] sentences = text.split("");
        System.out.println(Arrays.toString(sentences));
    }
    
=======
public class SampleSix {
    public static void main(String[] args) {
        int x = 0, sum = 0;

        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println("Summation: " + sum);
    }
>>>>>>> a0dfe3d8880e6da7f0adacb0db3242b9c7d5774d
}
