public class SampleThree { // main class
        
    public static void main(String[] args) // main methods
    {
        Encapsulate obj = new Encapsulate(); //ini
 
        // setting values of the variables
        obj.setName("Jefferson");// obj.setter Name
        
        obj.setAge(25);// obj.set age 25
        
        obj.setRoll(51);// obj.setter roll 51
        
 
        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());// code to be exe obj . getter name
        
        System.out.println("Geek's age: " + obj.getAge()); // getter Age
        
        System.out.println("Geek's role: " + obj.getRoll()); // obj . getter roll
 
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}



class Encapsulate { // class
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName; // private string geekName
    
    private int geekRoll; // private int geekroll
    
    private int geekAge; // private int geek age
 
    // get method for age to access
    // private variable geekAge
    public int getAge() { return geekAge; }// getter & return
    
 
    // get method for name to access
    // private variable geekName
    public String getName() { return geekName; }// getter name & return
 
    // get method for roll to access
    // private variable geekRoll
    public int getRoll() { return geekRoll; } // getter & return
 
    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) { geekAge = newAge; }// setter age getter age
 
    // set method for name to access
    // private variable geekName
    public void setName(String newName)// name
    {
        geekName = newName;// name
    }
 
    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { geekRoll = newRoll; }//setter roll new roll
}
 
//public class TestEncapsulation {
    
