package syntax.method_reference;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {
    

    public static void main(String[] args) {
        
        List<String> listA = Arrays.asList("Java", "JavaScript", "PHP");

        listA.stream()
            .map(String::toUpperCase)//<- Reference instance method from arbitrary object 
            .forEach(System.out::println);
    }
}
