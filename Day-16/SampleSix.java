// Driver class

public class SampleSix { // main class
	// Main function
	public static void main(String[] args) // main methods
	{
		Thirtytwo e = new Thirtytwo(); // ini
		e.print_geek();
		e.print_for();
		//e.print_geek();
	}
}

// Parent class
class Twelve {
	public void print_geek()
	{
		System.out.println("Sky");// code to be exe.
	}
}

class Thirtytwo extends Twelve {
	public void print_for() { System.out.println("are blue"); }
}


