package syntax.poo;

public class PolymorphismExample {

    static class Animal {

        String name = "Animal";
    
        String sound(){

            return "Generic animal sound";
        }  
    }

    static class Dog extends Animal {

        public Dog() {
            super();
            this.name = "Dog";
        }
    
        @Override
        String sound(){

            return "Guau Guau";
        }
    }

    static class Cat extends Animal {

        public Cat() {
            super();
            this.name = "Cat";
        }
        
        @Override
        String sound(){

            return "Meow Meow";
        }
    }

    static void reproduce(Animal animal){

        System.out.println(
            String.format("Class: %s, Sound: %s", animal.name, animal.sound())
        );
    }


    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        reproduce(animal);
        reproduce(dog);
        reproduce(cat);
    }
}
