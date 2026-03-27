
sealed class Vehicle permits twoWh , threeWh , fourWh{
    void display(){
        System.out.println("This is Vehicle");
    }
}
sealed class twoWh extends Vehicle permits Ebikes{
    void display(){
        System.out.println("This is Bike");
    }
}
final class Ebikes extends twoWh{
    void display(){
        System.out.println("this is Ebike");
    }
}
sealed class threeWh extends Vehicle permits eRik{
    void display(){
        System.out.println("This is auto");
    }
}
final class eRik extends threeWh{
    void display(){
        System.out.println("this is EAuto");
    }
}
sealed class fourWh extends Vehicle permits Ecar{
    void display(){
        System.out.println("This is CAr");
    }
}
final class Ecar extends fourWh{
    void display(){
        System.out.println("this is Ecar");
    }
}

public class sealedclass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.display();
        eRik r1 = new eRik();
        r1.display();
        
    }
}
