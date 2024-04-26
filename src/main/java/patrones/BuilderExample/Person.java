package patrones.BuilderExample;

public class Person {
    
    String firstName;
	String lastName;
	int age;
	String phone;
	String email;

    // public Person(String firstName, String lastName, int age, String phone, String email) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.age = age;
    //     this.phone = phone;
    //     this.email = email;
    // }

    private Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    @Override
    public String toString() {
       
        return String.format("Name: %s %s \nAge: %s \nPhone: %s \nEmail: %s", 
            this.firstName,
            this.lastName, 
            this.age,
            this.phone, 
            this.email
        );
    }

    public static PersonBuilder getBuilder(){

        return new PersonBuilder();
    }

    //Builder
    public static class PersonBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String email;

        PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        PersonBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        PersonBuilder email(String email){
            this.email = email;
            return this;
        }
    
        Person build(){

            return new Person(this);
        }
    }
}