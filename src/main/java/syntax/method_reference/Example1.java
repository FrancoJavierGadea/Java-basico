package syntax.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example1 {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Java", "JavaScript", "PHP");

        //Reference instance method from object         
        Function<String, String> concat = "Language: "::concat;

        //Reference static method from class 
        Consumer<String> show = System.out::println;

        list.stream()
            .map(concat)
            .forEach(show);
    }
}
