public class SampleSeven { // main class 
    
    // Program to demonstrate 2-D jagged array in Java

    public static void main(String[] args) // main methods
    {
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][]; // int arr new int
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[10]; // arr 0 new int 3 
 
        // Second row has 2 columns
        arr[1] = new int[2]; // arr 2
 
        // Initializing array
        int count = 0;//in count 
        
        for (int i = 0; i < arr.length; i++) // for in i 0 i<arr.length i++
            for (int j = 0; j < arr[i].length; j++)// for int j = 0 j<arr i. length j ++
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array"); // code to be exe.
        for (int i = 0; i < arr.length; i++) { // for int i = 0  i<arr.length i++ inc
            for (int j = 0; j < arr[i].length; j++) // for int j = 0 j < arr i . length j++
                System.out.print(arr[i][j] + " "); // code to be exe. i j value
            System.out.println(); // code to be exe.
        }
    }
}