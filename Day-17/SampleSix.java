// Class 1
// Abstract class
abstract class Base {
    abstract void fun();// fun
}

// Class 2
class Derived extends Base {
    void fun()
    {
        System.out.println("Gilas laban"); // print
    }
}

// Class 3
// Main class
//class Main {

public class SampleSix { // main class
    // Main driver method
    public static void main(String []args) // methods
    {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();// ini
        b.fun(); // call fun
    }
}