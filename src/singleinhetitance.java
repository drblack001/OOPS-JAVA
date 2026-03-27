class vehicle {
    void startEngine(){
        System.out.println("emgine started");
    }
    
}
class Car extends vehicle {
    void accelerate(){
        System.out.println("car acclerating");
    }    
}
public class singleinhetitance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.startEngine();
        obj.accelerate();
    }
}
