// Drived class

public class SampleNine { // main class
    
	public static void main(String[] args) // main methods
	{
		seven g = new seven(); // ini.
		g.print_geek();
		g.print_for();
		//g.print_geek();
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

//class three extends seven {
	//public void print_geek()
	//{
		//System.out.println("park");// code to be exe
	//}
//}

