public class SampleTwo {
    public static void main(String[] args) {
        String s1 = "   Java Training   ";
        System.out.println("String: " + s1);
        System.out.println("Length: " + s1.length());

        s1 = s1.trim();

        System.out.println("After Trim: " + s1);
        System.out.println("Length: " + s1.length());
    }    
}
