interface Bank {
void deposit();
void withdraw();
void loan();
void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit()
    {
        System.out.println("Your deposit Amount :" + 10000);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw()
    {
        System.out.println("Your withdraw Amount :" + 500);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {
        System.out.println("Your loan Amount :" + 4000);
    }
    public void account() {
        System.out.println("Your Account Amount :" + 2024);
    }
}

// Level 4
//class GFG {
class Exampleinter3 { // main class

    public static void main(String[] args) // main methods
    {
        Dev3 d = new Dev3(); // object ini.
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}