import java.util.*;

public class Abstraction {
    public static void main(String[] args) {

        // Car c1 = new Car();
        // c1.price = 10000000; 

        // We cannot create an object of Car class because it is abstract now.
        // Abstract classes cannot be instantiated directly.

        // c1.start();
        // This will also not work since Car is abstract and has no implementation for start().

        
        Mercedes_Benz car1 = new Mercedes_Benz();
        car1.start();  // Calls the overridden start() method of Mercedes_Benz class

        Audi car2 = new Audi();
        car2.start();  // Calls the overridden start() method of Audi class

    }
}

// Mercedes_Benz class extends the abstract Car class
// It must provide an implementation for the abstract start() method

class Mercedes_Benz extends Car {
    @Override
    void start() {
        System.out.println("Merceds is starting");  // Mercedes-specific implementation of start()
    }
}

// Audi class extends the abstract Car class
// It also provides its own implementation of the abstract start() method

class Audi extends Car {
    @Override
    void start() {
        System.out.println("Audi is starting");  // Audi-specific implementation of start()
    }
}

// Abstract class Car
abstract class Car {

    int price;  // Non-abstract field, can be inherited by subclasses

    // Abstract method start()
    // All subclasses must provide an implementation for this method
    
    abstract void start();  // No method body, must be implemented by concrete classes
}
