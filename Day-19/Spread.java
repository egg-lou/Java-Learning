public class Spread {
    public static void main(String[] args) {
        getSides(2,3,4, 5, 6, 7, 8, 7);
    }

    public static void getSides(int... sides) {
        for (int side: sides) {
            System.out.println(side);
        }
    }

}


