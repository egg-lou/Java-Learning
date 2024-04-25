public class SampleOne {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5});

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
} 