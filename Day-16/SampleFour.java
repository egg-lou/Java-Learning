// Driver Class

public class SampleFour {// main class
    
	public static void main(String args[]) // main methods
	{
		Engineer E1 = new Engineer(); // ini.
                
		System.out.println("Loan : " + E1.loan + "\nInterests : " + E1.Interests);
	}
}

class Employee {
	int loan = 800000;
}

// Inherited or Sub Class
class Engineer extends Employee {
	int Interests = 10000;
}

