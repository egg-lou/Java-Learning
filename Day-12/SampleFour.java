import java.util.*;

public class SampleFour {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in); // ini scanner 
 
        System.out.print("Enter number of rows: "); // code to be exe rows
        
        int rows = scan.nextInt(); // int rows = scan next int
 
        System.out.print("Enter number of columns: ");// code to be exe columns
        
        int columns = scan.nextInt(); // in colums = scan.next int
 
        int[][] multidimensionalArray= new int[rows][columns]; // ini rows and columns
 
        // Now you can use the array like a regular
        // 2-dimensional array
        
        for (int i = 0; i < rows; i++) { // for statement int data type i variable 0 value i < operator rows i++ inc
            for (int j = 0; j < columns; j++) { // for statement int data type j variable 0 value j ini < operator coumns j++ inc
                multidimensionalArray[i][j]= (i + 1) * (j + 1); // array true
            }
        }
        for (int i = 0; i < rows; i++) { // for statement int data type i variable 0 value i ini < rows i++ 
            for (int j = 0; j < columns; j++) { // nested for int data type j variable 0 value j< columns  j ++ inc
                System.out.print(multidimensionalArray[i][j]+ " "); // code to be exe
            }
 
            System.out.println(); // true code to be exe
        }
        scan.close();// scan.close 
    }
}
