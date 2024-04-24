import java.util.Locale;
public class SampleEleven {
    public static void main(String[] args) {
        String s = "hello Joysis Trainee. welcome to java training";
        
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));
        
        String english = s.toUpperCase(Locale.forLanguageTag("en"));
        
        System.out.println(turkish);
        
        System.out.println(english);
    }
}
