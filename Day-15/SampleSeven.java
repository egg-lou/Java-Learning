    public class SampleSeven { // main class 
        
    public static void main(String[] args) {// main methods
    
    toys veh = new toys(); // ini
    
    veh.sides = 8; // sides 8
    
    veh.display(); // display
    
    }
    
    }

class toys { // toys

    public int sides; // sides
    
    public void display() { // display
    
    System.out.println("I have a vehicle.");// vehicle
    
    System.out.println("It has " + sides + " Parts."); // sides parts
    
    }
    
    }
