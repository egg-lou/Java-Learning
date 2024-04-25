public class SampleFive {
    public static void main(String[] args) {
        String regex = "^a...s$";

        System.out.println("abs".matches(regex));
        
        System.out.println("alias".matches(regex)); 
        
        System.out.println("an abacus".matches(regex));

        System.out.println("abyss".matches(regex));
    }
}
