public class SampleFour {
    public static void main(String[] args) {
        String str = new String("Welcome to Java Training");
        
        System.out.print("Return Value: ");
        System.out.println(str.matches("(.*)Java(.*)"));

        System.out.print("Return Value: ");
        System.out.println(str.matches("Java"));

        System.out.print("Return Value: ");
        System.out.println(str.matches("Welcome(.*)"));
    }
}
