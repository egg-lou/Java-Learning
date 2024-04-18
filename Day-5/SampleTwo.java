public class SampleTwo {
    public static void main(String[] args) {
<<<<<<< HEAD
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";
        
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);
    }
    
=======
        int day = 50;
        String dayString;

        switch(day) {
            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednesday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            case 7:
                dayString = "Sunday";
                break;

            default:
                dayString = "Invalid Day";
                break;
        }
        System.out.println(dayString);
    }
>>>>>>> a0dfe3d8880e6da7f0adacb0db3242b9c7d5774d
}
