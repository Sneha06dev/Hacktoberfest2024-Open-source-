// First interface
interface CanRun {
    void run();
}

// Second interface
interface CanBark {
    void bark();
}

// Class implementing both interfaces
class Dog implements CanRun, CanBark {
    public void run() {
        System.out.println("The dog runs fast.");
    }

    public void bark() {
        System.out.println("The dog barks loudly.");
    }
}

// Class implementing both interfaces
class Cat implements CanRun {
    public void run() {
        System.out.println("The cat runs gracefully.");
    }

    // No barking method for Cat, only implementing CanRun
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(); // Output from Dog's run method
        dog.bark(); // Output from Dog's bark method

        Cat cat = new Cat();
        cat.run(); // Output from Cat's run method
    }
}
