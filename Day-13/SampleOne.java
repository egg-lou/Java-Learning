import java.time.*;

public class SampleOne {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2017, 1, 13);  // 2017 1 13
    
    LocalDateTime datetime = date.atTime( 1,50,9);      // 1 50 9 time
    
    System.out.println(datetime);  // date time 
  }
}
