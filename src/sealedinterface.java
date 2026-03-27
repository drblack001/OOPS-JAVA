sealed interface payment permits upi,cash,card{
    void display();
}
final class upi implements payment{
    public void display(){
        System.out.println("payment done by upi");
    }
}
final class card implements payment{
    public void display(){
        System.out.println("payment done by card");
    }
}
final class cash implements payment{
    public void display(){
        System.out.println("payment done by cash");
    }
}
public class sealedinterface {
    public static void main(String[] args) {
        cash c1 = new cash();
        c1.display();
    }
}
