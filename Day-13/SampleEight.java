import java.time.OffsetTime; 

public class SampleEight { // main class
 
  public static void main(String[] args) {  //main methods
      
    OffsetTime offset = OffsetTime.now();  //offsettime
    
    int m = offset.getMinute();  //data type int variable m offset
    
    System.out.println(m+ " minute");  
  }  
}