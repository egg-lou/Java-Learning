import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SampleTwo {
	public static void main(String[] args) {
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