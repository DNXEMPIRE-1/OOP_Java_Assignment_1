// Interface
interface Animal {
    void makeSound(); // Abstract method
}

// Abstract Class
abstract class Mammal implements Animal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // Abstract method 
    public abstract void move();
}

// Concrete Class
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    // abstract method from Mammal
    public void move() {
        System.out.println(name + " is running...");
    }

    // method from interface
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// Testing
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();  // From Interface
        myDog.move();       // From Abstract Class
        myDog.sleep();      // From Abstract Class (Concrete Method)
    }
}
