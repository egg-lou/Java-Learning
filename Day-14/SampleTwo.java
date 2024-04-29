import java.time.OffsetTime;

public class SampleTwo {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();  
    
        int m = offset.getMinute();  
        
        System.out.println(m+ " minute"); 
    }
    
}
