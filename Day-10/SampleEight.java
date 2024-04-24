import java.util.*;

public class SampleEight {
    public static void main(String[] args) {
        // Custom input string
        String s = "I Know YOI Bui You Don't Know ME"; // string variable value
 
        // Locales with the language "tr" for TURKISH
        //"en" for ENGLISH is created
        Locale TURKISH = Locale.forLanguageTag("tr"); // locale tur tr
        Locale ENGLISH = Locale.forLanguageTag("en");// locale en
 
        // Converting string s to lowercase letter
        // using TURKISH and ENGLISH language
        String gfg2 = s.toLowerCase(TURKISH);// lower case
        
        String gfg3 = s.toLowerCase(ENGLISH); // lower case
 
        // Printing above string
        System.out.println(gfg2); // code to be exe.
        
        System.out.println(gfg3); // 
    }    
}
