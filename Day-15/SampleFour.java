public class SampleFour {// main class
    
    public static void main(String[] args)// main methods
    {
 
        Name n1 = new Name();//ini
 
        n1.setAge(19);// n1 setter age 19
 
        System.out.println("The age of the person is: "
                           + n1.getAge()); // code to be exe age getter
    }
}

class Name { // class
 
    private int age; // Private is using to hide the data
 
    public int getAge() { return age; } // getter age
 
    public void setAge(int age) // public setter age
    {
        this.age = age;// this age
    } // setter
}
 
