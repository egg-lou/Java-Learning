public class SampleSeven { // main class
	// Main function
	public static void main(String[] args) // main methods
	{
		Thirtytwo e = new Thirtytwo(); // ini
		e.print_geek();
		e.print_for();
		e.print_geek();
            
        six g = new six();// ini
		g.print_geek();//
		g.print_for();//
		g.print_geek();//       
                
	}
}
// Parent class
class Four {
	public void print_geek()
	{
		System.out.println("top secret"); // code to be exe.
	}
}

class six extends Four {
	public void print_for() { System.out.println("file"); } // file
}

class Thirtytwo extends Four {
	public void print_for() { System.out.println("are blue"); }
}