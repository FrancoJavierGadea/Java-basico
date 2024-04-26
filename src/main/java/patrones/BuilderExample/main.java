package patrones.BuilderExample;


public class main {
    
    public static void main(String[] args) {
     
        Person javier = Person.getBuilder()
            .firstName("Emilia")
            .lastName("Gonzales")
            .age(25)
            .phone("+54 9 xxx xxx-xxxx")
            .email("emilia@test.com")
            .build();

        Person majo = new Person.PersonBuilder()
            .firstName("Emilia")
            .lastName("Gonzales")
            .age(25)
            .phone("+54 9 xxx xxx-xxxx")
            .email("emilia@test.com")
            .build();


        System.out.println(majo);

    }
}
