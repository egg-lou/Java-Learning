abstract class Base2 { //class

    // Demo method. This is not an abstract method.
    void fun2()
    {
        // Print message if class 1 function is called
        System.out.println("Function of Base class is called"); // function base
    }
}

// Class 2
class Derived2 extends Base2 { // extends
//This class only inherits the Base class methods and properties

}

// Class 3
//class Main {
public class SampleEight { // main class

    // Main driver method
    public static void main(String args[]) // main methods
    {
        // Creating object of class 2
        Derived2 d = new Derived2();// ini

        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun2();// call fun
    }
}