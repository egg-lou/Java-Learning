import java.time.LocalDateTime; // local date time

import java.time.format.DateTimeFormatter; // java lib

public class SampleThirteen { // main class
   
    public static void main(String[] args) // main methods
    {
        // now() is a method to return the
        // instance of LocalDateTime class.
        LocalDateTime localDate = LocalDateTime.now();
        // DateTimeFormatter class used to format and
        // parse date and time. ofPattern() is a method
        // used with DateTimeFormatter to format and
        // parse date and time.
        DateTimeFormatter dateformatter
            = DateTimeFormatter.ofPattern("MM dd, YYYY");// Month date year
        // display the date
        System.out.println(dateformatter.format(localDate)); // Month dates years
    }
}