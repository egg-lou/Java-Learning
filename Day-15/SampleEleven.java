    
    public class SampleEleven extends human { // main class extends to human
    
        public static void main(String[] args) { // main methods
        
        //Student s = new Student();
        SampleEleven s = new SampleEleven(); // ini
        
        s.stream = "Computer Science and Engineering Technology"; // string 
        
        s.display();// display
        
        }
        
        }
    

class human { // human sub class

    protected String stream; // protected 
    
    protected void display() { // display
    
    System.out.println("Hello, I am a " + stream + " Student"); // code to be exe.
    
    
    }
    
    }
    
    //public class Student extends human {
