package syntax.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Example3 {
   
    public static void main(String[] args) {
        
        class Person {

            String name;

            public Person(String name){
                this.name = name;
            }

            @Override
            public String toString() {
                
                return String.format("Person: %s", this.name);
            }
        }

        List<String> names = Arrays.asList("Olivia", "Emilia", "Emma");

        //Reference contructor method from class Person
        Function<String, Person> personContructor = Person::new;

        //Reference array contructor method from class Person
        IntFunction<Person[]> arrayContructor = Person[]::new;

        Person[] persons = names.stream()
            .map(personContructor)
            .toArray(arrayContructor);

        System.out.println(Arrays.toString(persons));
    }
}
