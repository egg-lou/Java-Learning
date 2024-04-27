import java.time.OffsetTime; // time lib

public class SampleSeven { // main class
    
  public static void main(String[] args) {  // main methods
      
    OffsetTime offset = OffsetTime.now();  // offsettime
    
    int h = offset.getHour();  // int data type h variable offset get hour
    
    System.out.println(h+ " hour");  // code to be exe hour
  }  
}
