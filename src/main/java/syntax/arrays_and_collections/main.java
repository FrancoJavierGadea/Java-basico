package syntax.arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class main {
    
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "JavaScript"};
        
        List<String> list = Arrays.asList(array);

        //array[1] = "PHP";
        list.set(1, "PHP");

        System.out.println(String.format("List: %s \nArray: %s", 
            list, 
            Arrays.toString(array)
        ));  
    }
}
