public class SampleThree {
    public static void main(String[] args) {
        String s1 = "   hello string   ";
        
        System.out.println(s1 + "Joysis Java Training");

        System.out.println(s1.trim() + "Joysis Java Training");

        String regexp = "\\s+|\\s+$";

        System.out.println();
        System.out.println("Using Regular Expression");
        System.out.println(s1.replaceAll(regexp, "") + "Joysis Java Training");
    }    
}
