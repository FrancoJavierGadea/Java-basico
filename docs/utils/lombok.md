
## [@Getter @Setter](https://projectlombok.org/features/GetterSetter)


## [@ToString]()

Genera un metodo `toString` que muestre todos los valores actuales del objeto con la siguiente forma

```text
Person(firstName=Leo, lastName=Rojas, age=30, phone=+54 9 xxx xxx-xxxx, email=leo.rojas@test.com)
```

Podemos quitar los nombres de las propiedades con `@ToString(includeFieldNames = false)`

```text
Person(Leo, Rojas, 30, +54 9 xxx xxx-xxxx, leo.rojas@test.com)
```
<br>


## [@Builder](https://projectlombok.org/features/Builder)

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
- `access`: **Modificador de acceso** que tendra la `Clase Builder`, default `AccessLevel.PUBLIC`
- `toBuilder`: Metodo que retorma una instancia de la `Clase Builder` con el **estado actual del objeto**, default `false`

<br>

## [@Data]

- `@ToString` `@EqualsAndHashCode` `@RequiredArgsConstructor`
- `@Getter` en todas las propiedades
- `@Setter` en todas la propiedades que no sean `final`



<br>

#### Doc

- [project lombok](https://projectlombok.org/)
- [REDUCING BOILERPLATE CODE WITH PROJECT LOMBOK](https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok)