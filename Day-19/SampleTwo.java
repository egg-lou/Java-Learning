import java.lang.Math;

interface  Polygon {
    void getArea();

    // calculate the perimeter of a Polygon
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        System.out.println("Perimeter: " + perimeter);// code to be exe.
    }
}

class Triangle implements Polygon {
    private int a, b, c;
    private double s, area;

    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

//class Main {
public class SampleTwo { // main class

    public static void main(String[] args) { // main methods
        Triangle t1 = new Triangle(2, 3, 4); // object ini value

// calls the method of the Triangle class
        t1.getArea();// getter area

// calls the method of Polygon
        t1.getPerimeter(2, 3, 4); // value
    }
}