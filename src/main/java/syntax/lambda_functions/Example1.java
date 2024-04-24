package syntax.lambda_functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {

    @FunctionalInterface
    public interface Printer<T> {

        void print(T value);
    }
    
    public static void main(String[] args) {
        
        Printer<String> func = new Printer<String>() {
            
            @Override
            public void print(String value) {
                
                
            }
        };


        List<Number> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Lambda function
        Consumer<Number> show = (value) -> {

            System.out.println(value);
        };

        //Anonymous class
        Consumer<Number> show2 = new Consumer<Number>() {
            
            @Override
            public void accept(Number value) {

                System.out.println("Value: " + value); 
            }
        };

        list.forEach(show2);


         
    }
}


