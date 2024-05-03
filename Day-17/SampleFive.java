// Abstract class
abstract class Sunstar { // abs class
    abstract void printInfo(); // printinfo
}

// Abstraction performed using extends
class Employee extends Sunstar { // extends
    void printInfo() {
        String name = "maricris"; // maricris
        int age = 21;
        float salary = 250.50F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

}

// Base class
//class Base {
public class SampleFive { // main class


    public static void main(String [] args) { // main methods
        Sunstar s = new Employee();// ini
        s.printInfo(); // print info
    }
}