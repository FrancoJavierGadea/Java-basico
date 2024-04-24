package syntax.varargs;

public class Example1 {

    String va = "sddd";
    
    public static void showList(String message, Object ...values){

        System.out.println(
            String.format("List: %s \n------------------", message)
        );

        for (Object value : values) {
            
            System.out.println(value.toString());
        }
    }

    public static void main(String... args) {
        
        showList("Numbers", new Number[]{1, 2, 3, 4, 5});

        showList("Numbers", 1, 2, 3, 4, 5);
    }
}
