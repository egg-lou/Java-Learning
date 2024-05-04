abstract class Demo { // sub class
    abstract void m1(); // m1
    abstract void m2(); // m2
    abstract void m3(); // m3
}

abstract class FirstChild extends Demo { // extends
    public void m1() {
        System.out.println("Inside m1");
    }
}

class SecondChild extends FirstChild { // extends
    public void m2() {
        System.out.println("Inside m2"); // m2
    }
    public void m3() {
        System.out.println("Inside m3"); // m3
    }
}

//class GFG {
public class SampleOne { // main class

    public static void main(String[] args) // main methods
    {
        // if we remove the abstract keyword from FirstChild
        // Class and uncommented below obj creation for
        // FirstChild then it will throw
        // compile time error as did't override all the
        // abstract methods

        // FirstChild f=new FirstChild();
        // f.m1();

        SecondChild s = new SecondChild(); // ini
        s.m1(); // call
        s.m2(); // call
        s.m3(); // call
    }
}