# Patron Builder

### Problema

Cuando tenemos un `objeto` mas o menos complejo con muchas `propiedades` que deben inicializarce con el **constructor**

```java
public class Person {
    
    String firstName;
	String lastName;
	int age;
	String phone;
	String email;

    public Person(String firstName, String lastName, int age, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
```

Tener un **contructor** largo con muchos paramentros es **poco practico y legible** a la hora de crear `objetos`

```java
Person person = new Person("Emilia", "Gonzales", 25, "+54 9 xxx xxx-xxxx", "emilia@test.com");
```
<br>

### Solucion en otros lenguajes

En `Python` existen los parametros nombrados

```python
person = Person(
    first_name = "Emilia",
    last_name = "Gonzales",
    age = 25,
    phone = "+54 9 xxx xxx-xxxx",
    email = "emilia@test.com"
)
```
En `JavaSript` puedes pasar un **objeto de configuracion**

```javascript
const person = new Person({
    firstName: "Emilia",
    lastName: "Gonzales",
    age: 25,
    phone: "+54 9 xxx xxx-xxxx",
    email: "emilia@test.com"
});
```

<br>


## Patron Builder

Creamos la `Clase` y en su interior o en otro archivo una `Clase builder` que nos servira como **objeto de configuracion**

La `Clase principal` tendra un metodo `getBuilder()` que nos devolvera una instancia de la `Clase builder`

La `Clase Builder` trenda un metodo `build()` que se llamara al final para crear el **objeto**

```java
public class Person {
    
    String firstName;
	String lastName;
	int age;
	String phone;
	String email;

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
```

Ahora podemos crear objectos **idetificando cada propiedad con su nombre**, usando un objeto `PersonBuilder` y al final ejecutando `build()`

```java
Person emilia = Person.getBuilder()
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
```

<br>

## Builder con Lombok

Con [lombok](https://projectlombok.org/features/Builder) y `@Builder` podemos adaptar cualquier `Clase` para que use el **Patron Builder** automaticamente

`@Builder` nos genera la dentro de la `Clase`

- La `Clase estatica` **Builder** con todas las **propiedades** y el metodo `build()`
- El `metodo estatico` `builder()` que retorma una instancia de **Builder**


```java
import lombok.Builder;
import lombok.ToString;

@ToString @Builder
class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;
}
```

```java
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
```
<br>

Y podemos customizar esto pasandole a parametros `@Builder(...args)`

- `buildMethodName`: default `"build"`
- `builderMethodName`: default `"builder"`
- `buildMethodName`: default `className + "Builder"`
- `setterPrefix`: default `null`

<br>

#### Docs

- [Java Builder Pattern: Build Complex Objects Efficiently](https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/)
- [Builder Design Pattern: Implementation in Java](https://medium.com/@thecodebean/builder-design-pattern-implementation-in-java-6adc6fd99ee0)