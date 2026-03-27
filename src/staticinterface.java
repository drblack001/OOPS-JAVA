interface Vehicle {
    static void fuelType() {
        System.out.println("Vehicles use fuel or electricity");
    }
}

public class staticinterface {
    public static void main(String[] args) {
        Vehicle.fuelType(); 
    }
}