public class SampleOne extends human2{ // main class extends human2
            
    public static void main(String[] args) {// main methods
    
    //Student s = new Student();
    SampleOne s = new SampleOne(); // ini
    
    s.stream = "Computer Science,Phd";// code to be exe. protected
    
    s.display(); // display
    
    }
    
    }

class human2 { // human1 subclass

    protected String stream; // protected string 
    
    protected void display() { // display
    
    System.out.println("Hello, I am a " + stream + " Student");// hello code to be exe.
    
    }
    
    }
    
    
    
    
    
