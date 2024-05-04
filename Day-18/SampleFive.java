interface Polygon { // interface
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

//class Main {

class Exampleinter4 {// main class

    public static void main(String[] args) { // main methods
        Rectangle r1 = new Rectangle(); // object ini.
        r1.getArea(5, 6);// display
    }
}