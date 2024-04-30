public class SampleTen {// main class
        
    public static void main(String[] args) { // main methods
    
    Student1 s = new Student1(); // ini
    
    //ExampleEncap10 s = new ExampleEncap10();
    
    s.setRank(10); // setter rank
    
    System.out.println("Student books our " + s.getRank()); // code to be exe. getter rank
    
    }
}

class Student1 { // subclass student1

    private int books; // books
    
    public int getRank() { // getter rank
    
    return books; // return books
    
    }
    
    public void setRank(int books) { // setter rank
    
    this.books = books;// this. book
    
    }
    
    }
    
    

