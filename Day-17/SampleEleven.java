abstract class Demo { // supclass
    abstract void m1();
}

class Child extends Demo { // extends
    public void m1()
    {
        System.out.println("protect WPS");
    }
}
//class GFG {
public class SampleEleven { // main class
    public static void main(String[] args) // main methods
    {
        Child c = new Child(); // ini
        c.m1();// call function
    }
}