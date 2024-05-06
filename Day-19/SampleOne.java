interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

    // implementation of abstract method
    public void getName(String name) {
        System.out.println("Programming Language: " + name);
    }
}

//class Main {
public class SampleOne {// main class

    public static void main(String[] args) { // main methods
        ProgrammingLanguage language = new ProgrammingLanguage();// object ini.
        language.getName("Java programming language");//getter
    }
}