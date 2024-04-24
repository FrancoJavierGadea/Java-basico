

## Interfaz

Es una coleccion de

- **Metodos abstractos**
    Por defecto, todos los metodos son `public abstract`

- **Contantes estaticas**
    Por defecto, todas las propiedades son `public static final`

- **Metodos estaticos**


```java
public interface Developer {
    
    //Public abstract methods
    String coding(String lang);

    //Public static final properties
    String[] LANGUAGES = {"Java", "PHP", "JavaScript"};

    //Public static methods
    static Boolean containsLanguage(String lang){

        return Arrays.stream(LANGUAGES).anyMatch((value) -> {

            return value == lang;
        });
    }
}
```
<br>
   
Las `interfaces` definen **un contrato** con la `Clase` que la implementa:

todos los `metodos abstractos` definidos en interfaz deben ser implementados en la `Clase` para que esta se compile correctamente


```java
class Person implements Developer {

    @Override
    public String coding(String lang) {
        
        return String.format("I'm coding in %s", lang);
    } 
}
```




#### Docs

- [What Is an Interface](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
- [Java Interface](https://www.w3schools.com/java/java_interface.asp)