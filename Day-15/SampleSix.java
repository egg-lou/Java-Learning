public class SampleSix { // main class
        
    public static void main(String[] args) { // main methods
    
    car veh = new car(); // ini
    
    veh.tires = 6;// tires
    
    veh.display();// display 
    
    }
    
}

class car { // car

    public int tires; // public int tires
    
    public void display() { // display
    
    System.out.println("I have a vehicle."); // I have a vehicle
    
    System.out.println("It has " + tires + " tires."); // code to be exe. tires 
    
    }
    
}
    

