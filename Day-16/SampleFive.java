// Driver class
//public class Main {
	public class SampleFive {// main class
    
		// Main function
		public static void main(String[] args) // main methods
		{
			two g = new two(); // ini
			g.print_geek();
			g.print_for();
			//g.print_geek();
		}
	}

// Parent class
class one { 
	public void print_geek()
	{
		System.out.println("Good"); // code to be exe.
	}
}

class two extends one {
    
	public void print_for() { System.out.println("Morning"); }// morning
}


