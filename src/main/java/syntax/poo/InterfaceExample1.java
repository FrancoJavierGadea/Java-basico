package syntax.poo;

import java.util.Arrays;

public class InterfaceExample1 {

    public interface Developer {
    
        //Public abstract methods
        String coding(String lang);

        //Public static final properties
        String[] LANGUAGES = {"Java", "PHP", "JavaScript"};

        //Public static methods
        static Boolean containsLanguage(String lang){

            return Arrays.stream(LANGUAGES).anyMatch((value) -> {

                return value == lang;
            });
        }

    }

    public static class Person implements Developer {

        @Override
        public String coding(String lang) {
            
            return String.format("I'm coding in %s", lang);
        } 
    }
    
    public static void main(String[] args) {
        
        Person person = new Person();

        System.out.println(person.coding("JavaScript"));
    }
}
