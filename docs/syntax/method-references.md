# Method reference

- `<class>::<static method>`
- `<object>::<instance method>`


## Method reference `::`

```java
public static class Printer {
    
    public static void showMessage(String message){

        System.out.println("Mensaje: " + message);
    }
}
```

```java
Consumer<String> func = Printer::showMessage;
```


<br>


#### Ejemplo 1 - [show](/src/main/java/syntax/method_reference/Example1.java)

Hacer referencia a un metodo de un objeto en particular

```java
List<String> list = Arrays.asList("Java", "JavaScript", "PHP");

//Reference instance method from object         
Function<String, String> concat = "Language: "::concat;

//Reference static method from class 
Consumer<String> show = System.out::println;

list.stream()
    .map(concat)
    .forEach(show);

```
> `"Language: "::concat` es lo mismo que `(string) -> "Language: ".concat(string)`
>
> `System.out::println` es lo mismo que `(string) -> System.out.println(string)`
<br>


#### Ejemplo 2 - [show](../../src/main/java/syntax/method_reference/Example2.java)

Hacer referencia a un metodo de un objeto arbitrario

```java
List<String> list = Arrays.asList("Java", "JavaScript", "PHP");

list.stream()
    .map(String::toUpperCase)//<- Reference instance method from arbitrary object 
    .forEach(System.out::println);
```
> `map(String::toUpperCase)` es lo mismo que `(string) -> string.toUpperCase()`
>
> `System.out::println` es lo mismo que `(string) -> System.out.println(string)`
<br>


#### Ejemplo 3 - [show](../../src/main/java/syntax/method_reference/Example3.java)

```java
class Person {

    String name;

    public Person(String name){
        this.name = name;
    }
}
```

```java
List<String> names = Arrays.asList("Olivia", "Emilia", "Emma");

//Reference contructor method from class Person
Function<String, Person> personContructor = Person::new;

//Reference array contructor method from class Person
IntFunction<Person[]> arrayContructor = Person[]::new;

Person[] persons = names.stream()
    .map(personContructor)
    .toArray(arrayContructor);
```

> `Person[]::new` es lo mismo que `(name) -> new Person(name)`
>
> `Person[]::new` es lo mismo que `(size) -> new Person[size]`
<br>

#### Docs

- [Method References](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)