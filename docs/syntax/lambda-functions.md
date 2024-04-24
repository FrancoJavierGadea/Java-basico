# Lambda functions

## Interfaz funcional

Es una interfaz que contiene **1 solo metodo abstracto**

Funcionan como **tipos** para las `Lambda functions`

```java
@FunctionalInterface
public interface Printer<T> {

    void print(T value);
}
```

```java
Printer<String> func = new Printer<String>() {
            
    @Override
    public void print(String value) {
         
        System.out.println(value);
    }
};
```

```java
Printer<String> func = (String value) -> {
         
    System.out.println(value);
};
```


<br>


### `Function<T, R>`

Lambda function
```java
Function<Number, Number> func = (value) -> {

    return value;
};
```

Anonymous class
```java
Function<Number, Number> func = new Function<Number,Number>(){
            
    @Override
    public Number apply(Number value) {
        
        return value;
    }
};
```
<br>


### `Predicate<T>`

Lambda function
```java
Predicate<Number> func = (value) -> {
    
    return true;
};
```

Anonymous class
```java
Predicate<Number> func = new Predicate<Number>() {
            
    @Override
    public boolean test(Number value) {
        
        return false;
    }
};
```
<br>

### `Consumer<T>`

Lambda function 
```java
Consumer<Number> func = (value) -> {

    System.out.println(value);
};
```

Anonymous class
```java
Consumer<Number> func = new Consumer<Number>() {
    
    @Override
    public void accept(Number value) {

        System.out.println(value); 
    }
};
```