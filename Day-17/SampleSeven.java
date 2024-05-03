// Class 1
// Abstract class
abstract class Base1 { // sub class

    // Constructor of class 1
    Base1()
    {
        // Print statement
        System.out.println("Base Constructor Called");// base
    }

    // Abstract method inside class1
    abstract void fun1(); // fun
}

// Class 2
class Derived1 extends Base1 { // extends

    // Constructor of class2
    Derived1()
    {
        System.out.println("Derived Constructor Called");// derived
    }

    // Method of class2
    void fun1()
    {
        System.out.println("Derived fun() called");// code to be exe.
    }
}

// Class 3
// Main class
//class GFG {
public class SampleSeven { // main class

    // Main driver method
    public static void main(String [] args) // main methods
    {
        // Creating object of class 2
        // inside main() method
        Derived1 d = new Derived1(); // ini
        d.fun1();// d. fun
    }
}