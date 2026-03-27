interface Vehicle {

    default void start() {
        System.out.println("Vehicle is starting...");
    }

    static void fuelType() {
        System.out.println("Common fuel types available");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with self-start");
    }
}
class car implements Vehicle{
    public void start(){
        System.out.println("car starts with clutch");
    }
}

public class combinedefaultstaticimterface {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();  
        
        car c = new car();
        c.start();

        Vehicle.fuelType();     
    }
}