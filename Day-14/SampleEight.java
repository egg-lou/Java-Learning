import java.time.Clock;

public class SampleEight {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();

        System.out.println(clock);

        System.out.println("Time Zone: " + clock.getZone());

    }
    
}
