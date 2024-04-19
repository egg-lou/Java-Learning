public class SampleSix {
  public static void main(String[] args) {
    String str1 = "aabbaaac";
    
    String str2 = "Learn223Java55@";

    String regex = "\\d+";

    System.out.println(str1.replaceAll("aa", "zz"));

    System.out.println(str2.replaceAll(regex, ""));
    
  }
}
