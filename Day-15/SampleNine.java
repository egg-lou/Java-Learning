    
    //public class ExampleEncap8 {
    
        public class SampleNine { // main class
        
            public static void main(String[] args) { // main methods
            
            Student s = new Student(); // ini student 
            
            s.setRank(90);// setter 90 
            
            System.out.println("Student Grade is " + s.getRank());// code to be exe. getter rank
            
            
            }
            
            }

class Student { // subclass student

    private int Grade; // private grade
    
    public int getRank() { // getter rank
    
    return Grade; // return grade
    
    }
    
    public void setRank(int Grade) {// public setter rank
    
    this.Grade = Grade;// this grade
    
    }
    
    }
    

