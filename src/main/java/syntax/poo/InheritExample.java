package syntax.poo;


public class InheritExample {

    static class Animal {
    
        public Animal(){
            System.out.println("Constructor: Animal");
        }
    }

    static class Mamifero extends Animal {
    
        public Mamifero(){
            System.out.println("Constructor: Mamifero");
        }
    }

    static class Cat extends Mamifero {
    
        public Cat(){
            System.out.println("Constructor: Cat");
        }
    }

    
    public static void main(String[] args) {

        Cat cat = new Cat();
    }
}