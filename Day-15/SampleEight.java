//public class school {
    public class SampleEight { // main class
    
        public static void main(String[] args) { // main methods
        
        Student2 s = new Student2(); // ini
        
        s.setRank(1022);//s setter rank
        
        System.out.println("Student rank is " + s.getRank());// getter rank
        
        }
        
        }

class Student2 { // class student

private int rank; // private rank

public int getRank() { // getter rank & return rank

return rank;

}

public void setRank(int rank) { // public setter rank

this.rank = rank; // this.

}

}



