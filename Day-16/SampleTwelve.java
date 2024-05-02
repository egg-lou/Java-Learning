

// Driver Class

public class SampleTwelve { // main class
    
	public static void main(String[] args) // main methods
	{
		F obj_B = new F();
		obj_B.print_A1();
		obj_B.print_B1();

		G obj_C = new G();
		obj_C.print_A1();
		obj_C.print_C1();

		//H obj_D = new H();
		//obj_D.print_A1();
		//obj_D.print_D1();
	}
}class E {
	public void print_A1() { System.out.println("Park A"); }
}

class F extends E {
	public void print_B1() { System.out.println("Park B"); }
}

class G extends E {
	public void print_C1() { System.out.println("Park C"); }
}

class H extends E {
	public void print_D1() { System.out.println("Park D"); }
}

