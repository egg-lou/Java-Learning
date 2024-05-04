interface In1 { // interface

    // public, static and final
    final int a = 7; // final

    // public and abstract
    void display(); // abstract
}

// A class that implements the interface.
//class TestClass implements In1 {
class Exampleinter1 implements In1 { // in1

    // Implementing the capabilities of
    // interface.
    public void display(){ // display
        System.out.println("Happy three kings");
    }

    // Driver Code
    public static void main(String[] args) // main methods
    {
        //TestClass t = new TestClass();
        Exampleinter1 t  = new Exampleinter1(); // exampleinter1 ini
        t.display(); // display
        System.out.println(a); // code to be exe
    }
}