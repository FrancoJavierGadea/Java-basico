package utils.lombok;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class main {

    @ToString(includeFieldNames = false) @Builder() @Setter() @Getter()
    static class Person {
        
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String email;
    }
    
    public static void main(String[] args) {
        
        Person emilia = Person.builder()
            .firstName("Emilia")
            .lastName("Gonzales")
            .age(25)
            .phone("+54 9 xxx xxx-xxxx")
            .email("emilia@test.com")
            .build();

        Person leo = new Person.PersonBuilder()
            .firstName("Leo")
            .lastName("Rojas")
            .age(30)
            .phone("+54 9 xxx xxx-xxxx")
            .email("leo.rojas@test.com")
            .build();

        System.out.println(emilia);   
        System.out.println(leo);
    }
}
