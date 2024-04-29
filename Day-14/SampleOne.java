import java.time.OffsetTime;

public class SampleOne{
    public static void main(String[] args) {
       OffsetTime offset = OffsetTime.now();  
        int h = offset.getHour();  
        
        System.out.println(h+ " hour");  
    }
}