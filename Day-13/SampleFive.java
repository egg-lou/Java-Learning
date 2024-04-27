import java.time.*;  // java monthly day
import java.time.temporal.*;   // time tempora lib

public class SampleFive { // main class
    

  public static void main(String[] args) {  // main methods
      
    MonthDay month = MonthDay.now();  //monthday ini
    
    long n = month.get(ChronoField.MONTH_OF_YEAR);  // long data type get month of year
    
    System.out.println(n);  // code to be exe.
  }  
}