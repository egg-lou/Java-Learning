import java.time.OffsetDateTime;

public class SampleFive {
    public static void main(String[] args) {
         OffsetDateTime offsetDT = OffsetDateTime.now();
       
        System.out.println(offsetDT.getDayOfWeek()); 
    }
}
