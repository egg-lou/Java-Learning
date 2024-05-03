interface twenty {
    public void print_geek2(); //  in
}

interface twentyone {
    public void print_for2();// print for 2
}

interface twentytwo extends twenty, twentyone {
    public void print_geek2();// print2
}
class child2 implements twentytwo { // implements

    @Override public void print_geek2()
    {
        System.out.println("Jordan Clarkson"); //
    }

    public void print_for2() { System.out.println("for 3-point"); }
}

// Drived class

public class SampleThree { // main class

    public static void main(String[] args)// main methods
    {
        child2 c = new child2(); // ini
        c.print_geek2();//c print_geek2
        c.print_for2();// c print_for2
        c.print_geek2();// c print_geek2
    }
}
