public class SampleTwelve extends human1{ // main class extends human1
        
    public static void main(String[] args) {// main methods
    
    //Student s = new Student();
    SampleTwelve s = new SampleTwelve(); // ini
    
    s.stream = "Master of Science in Computer Science";// code to be exe. protected
    
    s.display(); // display
    
    }
    
    }


class human1 { // human1 subclass

    protected String stream; // protected string 
    
    protected void display() { // display
    
    System.out.println("Hello, I am a " + stream + " Student");// hello code to be exe.
    
    }
    
    }
    
    
    
    
