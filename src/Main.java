interface Vehicle {
    
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {
    
    public void start() {
        System.out.println("Car is starting with key...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}