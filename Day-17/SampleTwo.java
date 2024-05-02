interface one {
    public void print_geek2();
}

interface two {
    public void print_for2();
}

interface three extends one, two {
    public void print_geek2();
}
class child implements three {

    @Override public void print_geek2()
    {
        System.out.println("FIBA");
    }

    public void print_for2() { System.out.println("Basketball "); }
}

// Drived class
//public class Main {
public class SampleTwo {

    public static void main(String[] args)
    {
        child c = new child();
        c.print_geek2();
        //c.print_for2();
        //c.print_geek2();
    }
}