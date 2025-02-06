// Interface: Defines a blueprint for an animal with a method signature but no implementation
interface Animal {
    void makeSound(); // Abstract method (no implementation)
}

// Abstract Class: Provides some implementation but still requires subclasses to implement abstract methods
abstract class Mammal implements Animal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    // Concrete method (implemented)
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void move();
}

// Concrete Class: Implements all abstract methods and can be instantiated
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    // Implementing abstract method from Mammal
    public void move() {
        System.out.println(name + " is running...");
    }

    // Implementing method from interface
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// Testing the implementation
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();  // From Interface
        myDog.move();       // From Abstract Class
        myDog.sleep();      // From Abstract Class (Concrete Method)
    }
}
