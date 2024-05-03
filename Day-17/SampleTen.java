abstract class B { // sub class
    // declaring inner class as abstract with abstract
    // method
    abstract class C {
        abstract void myAbstractMethod(); // methods
    }
}
class D extends B { // extends
    class E extends C { // extends
        // implementing the abstract method
        void myAbstractMethod()
        {
            System.out.println(
                    "Inside abstract method implementation");
        }
    }
}

//public class Main {

public class SampleTen { // main class

    public static void main(String []args) // main methods
    {
        // Instantiating the outer class
        D outer = new D(); // ini D

        // Instantiating the inner class
        D.E inner = outer.new E();// ini
        inner.myAbstractMethod(); // call function
    }
}