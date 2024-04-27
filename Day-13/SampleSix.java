import java.time.OffsetTime;   // offset time
import java.time.temporal.ChronoField; // time tempora1 chrono field

public class SampleSix { // main class
    
  public static void main(String[] args) { // main methods
      
    OffsetTime offset = OffsetTime.now(); // offsettime offset = offsettime 
    
    int h = offset.get(ChronoField.HOUR_OF_DAY); // int data type h variable = offset.get chrono field hour of day
    
    System.out.println(h);  // code to be exe. hour
    
    int m = offset.get(ChronoField.MINUTE_OF_DAY);  // int data type m variable offset.get chronoField Minute 
    
    System.out.println(m);  // code to be exe Minute
    
    int s = offset.get(ChronoField.SECOND_OF_DAY);  // int data type s variable offset get chronofield second
    
    System.out.println(s);  // code to be exe second
  }  
}