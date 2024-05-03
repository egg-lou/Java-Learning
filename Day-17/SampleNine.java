abstract class Helper { // abstract sup class

    // Abstract method
    static void demofun()
    {

        // Print statement
        System.out.println("Laban Gilas"); // demo fun 
    }
}

// Class 2
// Main class extending Helper class
//public class GFG extends Helper {

public class SampleNine extends Helper { // extends helper

    // Main driver method
    public static void main(String[] args) // main methods
    {

        // Calling method inside main()
        // as defined in above class
        Helper.demofun();// call function
    }
}