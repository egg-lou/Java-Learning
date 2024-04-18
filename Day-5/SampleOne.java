public class SampleOne {
    public static void main(String[] args) {
<<<<<<< HEAD
        String first = "Java ";
        System.out.println("First String: " + first);

        String second = "Programming";
        System.out.println("Second String: " + second);

        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }   
=======
        int number = 100;
        String size;

        switch(number) {
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;
        }

        System.out.println("Size: " + size);

    }
>>>>>>> a0dfe3d8880e6da7f0adacb0db3242b9c7d5774d
}
