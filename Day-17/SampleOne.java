class E {
    public void print_A() { System.out.println("Manila Zoo"); }
}

class F extends E {
    public void print_B() { System.out.println("Malabon Zoo"); }
}

class G extends E {
    public void print_C() { System.out.println("Avilon Zoo"); }
}

class H extends E {
    public void print_D() { System.out.println("Baluarte"); }
}

// Driver Class


public class SampleOne {

    public static void main(String[] args)
    {
        //F obj_B = new F();
        //obj_B.print_A();
        //obj_B.print_B();

        G obj_C = new G();
        obj_C.print_A();
        obj_C.print_C();

        H obj_D = new H();
        obj_D.print_A();
        obj_D.print_D();
    }
}