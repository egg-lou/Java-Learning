public class SampleOne { // main class
    
        public static void main(String[] args) // main methods
        {
            Person person = new Person(); // Person person ini.
            
            person.setName("Hans");// setter Hans
            
            person.setAge(30); // set age 30
            
     
            System.out.println("Name: " + person.getName());// code to be exe.
            
            System.out.println("Age: " + person.getAge()); // getter age


            Person child = new Person();

            child.setName("Jedd");
            child.setAge(5);

            System.out.println("Name: " + child.getName());
            
            System.out.println("Age: " + child.getAge());

        }
    }

class Person { // class person
    
    private String name; // private string name
    
    private int age; // private int age 
 
    public String getName() { return name; }// getter name & return name
 
    public void setName(String name) { this.name = name; }// setter name this.name
 
    public int getAge() { return age; }// public int getter age & return age
 
    public void setAge(int age) { this.age = age; }// public void setter age
}

