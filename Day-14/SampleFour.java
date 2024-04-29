import java.time.OffsetDateTime;

public class SampleFour {
    public static void main(String[] args) {
         OffsetDateTime offsetDT = OffsetDateTime.now(); 
        
        System.out.println(offsetDT.getDayOfYear()); 
    }
}
