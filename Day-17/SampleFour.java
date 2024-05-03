interface thirty {
    public void print_geek5(); // print_geek
}

interface thirtyone {
    public void print_for5(); // print for
}

interface thirtytwo extends thirty, thirtyone {
    public void print_geek5();// extends
}

interface thirtyfour extends thirty, thirtyone {
    public void print_geek6();// extends
}

class child6 implements thirtyfour {

    @Override public void print_geek6()
    {
        System.out.println("Laban"); // Gilas
    }

    //public void print_for5() { System.out.println("Laban"); } //
    //public void print_for6() { System.out.println("Pilipinas"); } //

    @Override
    public void print_geek5() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void print_for5() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}


class child5 implements thirtytwo {

    @Override public void print_geek5()
    {
        System.out.println("Gilas"); // Gilas
    }

    //public void print_for5() { System.out.println("Laban"); } //
    //public void print_for6() { System.out.println("Pilipinas"); } //

    @Override
    public void print_for5() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Drived class

//public class ExampleInher14 {
public class SampleFour { // main class

    public static void main(String[] args) // main methods
    {
        child5 c = new child5(); // ini
        c.print_geek5();// print
        //c.print_for5();// print
        //c.print_geek5();// print
        //c.print_for6();// print

        //child6 j = new child6(); // ini
        //j.print_geek6();// print
    }
}