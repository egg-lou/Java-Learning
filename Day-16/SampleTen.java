// Drived class

//public class ExampleInher8 {
	public class SampleTen {// main class
    
		public static void main(String[] args) // main methods
		{
			fourteen g = new fourteen(); // ini
					three f = new three(); // ini
			f.print_geek();
			f.print_for();
			f.print_geek();
					g.print_geek1(); // 
			g.print_for1(); // 
			//g.print_geek1();//
					
		}
	}

class twelve { // 
	public void print_geek()
	{
		System.out.println("bulacan");// code to be exe
	}
}

class seven extends twelve {
	public void print_for() { System.out.println("nature "); } // code to be exe.
}

class three extends seven {
	public void print_geek()
	{
		System.out.println("park");// code to be exe
	}
}
/////////////////////////////////////////////////////

class sixteen {
	public void print_geek1()
	{
		System.out.println("Manila"); // manila
	}
}

class fifteen extends sixteen {
	public void print_for1() { System.out.println("luneta "); }// luneta
}

class fourteen extends fifteen {
	public void print_geek1()
	{
		System.out.println("park");// park
	}
}

