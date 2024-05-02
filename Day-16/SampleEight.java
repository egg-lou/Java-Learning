// Drived class
//public class Main {
	public class SampleEight { // main class
    
		public static void main(String[] args) // main methods
		{
			three1 g = new three1(); // ini
			g.print_geek();
			g.print_for();
			g.print_geek();
		}
	}

class twelve1 {
	public void print_geek()
	{
		System.out.println("Good morning ");
	}
}

class seven1 extends twelve1 {
	public void print_for() { System.out.println("basketball"); }
}

class three1 extends seven1 {
	public void print_geek()
	{
		System.out.println("whole court");
	}
}

