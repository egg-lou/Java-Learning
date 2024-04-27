import java.time.OffsetTime; // library

import java.time.temporal.ChronoField; // library 


public class SampleNine { // main class
    

  public static void main(String[] args) {// main methods
      
    OffsetTime offset = OffsetTime.now();  //ini.
    int h = offset.get(ChronoField.HOUR_OF_DAY);  
    System.out.println(h);  
    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
    System.out.println(m);  
    int s = offset.get(ChronoField.SECOND_OF_DAY);  
    System.out.println(s);  
  }  
}