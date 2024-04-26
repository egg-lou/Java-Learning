import java.time.*;  // java time

public class SampleTwelve { // main class
   
  public static void main(String[] args) {  // main methods
      
    LocalDate date = LocalDate.of(2017, 1, 13);  // 2017 1 13
    
    LocalDateTime datetime = date.atTime(1,50,9);      // 1 50 9 time
    
    System.out.println(datetime);  // date time 
  }  
}