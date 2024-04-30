public class SampleFive {// main class
        
    
    public static void main(String[] args) { // main methods
    
    vehicle veh = new vehicle();//ini 
    
    veh.tires = 4;// 4 tires
    
    veh.display();// display
    
    }
}


class vehicle { // vehicle

    public int tires; // tires
    
    public void display() { // display
    
    System.out.println("I have a vehicle."); //code to be exe.
    
    System.out.println("It has " + tires + " tires.");// code to be exe
    
    }
    
}
    
