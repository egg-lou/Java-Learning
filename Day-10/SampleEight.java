import java.util.*;

public class SampleEight {
    public static void main(String[] args) {
        String s = "I Know YOI Bui You Don't Know ME";
 
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");
 
        String gfg2 = s.toLowerCase(TURKISH);
        String gfg3 = s.toLowerCase(ENGLISH);
 
        System.out.println(gfg2);
        System.out.println(gfg3);
    }    
}
