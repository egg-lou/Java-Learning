import java.time.LocalDate; // import local date

public class SampleEleven { // main class 
  public static void main(String[] args) {    // main methods
      
    LocalDate date1 = LocalDate.of(2024, 12, 29);   // 2014 1 13
    
    System.out.println(date1.isLeapYear());    // is leap year
    
    LocalDate date2 = LocalDate.of(2022, 9, 23);    // 2022 9 23
    
    System.out.println(date2.isLeapYear());    // is leap year
  }    
}