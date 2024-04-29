import java.time.Clock;

public class SampleSeven {
    public static void main(String[] args) {
        Clock c = Clock.systemUTC();

        System.out.println(c.instant());
    }   
}
