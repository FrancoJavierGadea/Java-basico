


## Polimorfismo

Las `Subclases` de una `Clase` pueden definir sus propios comportamientos unicos para las `Propiedades` y `Metodos` que tienen en comun con la `Clase` principal

- Los `Metodos` se pueden **sobrescribir** con `@Override`
- Las `Propiedades` se pueden redefinir en el contructor

<br>

La **maquina virtual de Java** `JVM` llama al `Metodo` apropiado para el objeto al que se hace referencia en cada variable

y no necesariamente coincidira con el tipo con el que fue declarada la variable




<br>

#### Ejemplo 1 - [show](../../../src/main/java/syntax/poo/PolymorphismExample.java)


Dada la `Clase` **Animal** y las `Subclases` **Dog**, **Cat**

```java
class Animal {

    String name = "Animal";

    String sound(){

        return "Generic animal sound";
    }  
}

class Dog extends Animal {

    public Dog() {
        super();
        this.name = "Dog";
    }

    @Override
    String sound(){

        return "Guau Guau";
    }
}

class Cat extends Animal {

    public Cat() {
        super();
        this.name = "Cat";
    }
    
    @Override
    String sound(){

        return "Meow Meow";
    }
}
```

Y un metodo que recibe un objeto de tipo **Animal** que consume sus `Propiedades` y `Metodos` comunes

```java
void reproduce(Animal animal){

    System.out.println(
        String.format("Class: %s, Sound: %s", animal.name, animal.sound())
    );
}
```

Obtenemos un resultado ditinto segun si usamos un objeto **Animal**, **Dog**, **Cat**

```java
Animal animal = new Animal();
Dog dog = new Dog();
Cat cat = new Cat();

reproduce(animal);//-> Class: Animal, Sound: Generic animal sound
reproduce(dog);//-> Class: Dog, Sound: Guau Guau
reproduce(cat);//-> Class: Cat, Sound: Meow Meow
```


<br>

#### Docs

- [Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [Java Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp)