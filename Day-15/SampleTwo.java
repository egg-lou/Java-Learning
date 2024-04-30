public class SampleTwo {
    
    public static void main(String[] args)
    {
 
        Area rectangle = new Area(2, 16); // ini 
        
        rectangle.getArea();
    }
}

class Area { // class
 
    int length; // int length
    
    int breadth;// breadth
 
    // constructor to initialize values
    Area(int length, int breadth) // ini.
    {
        this.length = length;// this.length = length ini
        
        this.breadth = breadth;// this. breadth = breadth ini
    }
 
    // method to calculate area
    public void getArea() //getter area
    {
        int area = length * breadth;//int area = length * breadth
        
        System.out.println("Area: " + area);// code to be exe.
    }
}
 

    

