// Driver Class
//class Gfg {
	public class SampleThree { // main class
    
		public static void main(String args[])// main methods
		{
			Engineer E1 = new Engineer();// ini
					
					Employee E2 = new Employee();
			
					System.out.println("\nBenefits : " + "Salary : "  + E1.benefits); // + E1.salary1
					
					System.out.println("\n"+ "Salary : "  + E2.salary1);
		}
	}

// Base or Super Class
class Employee {
	int salary1 = 250000; // 250k
}

// Inherited or Sub Class
class Engineer extends Employee {
	int benefits = 200000; // 200k
}


