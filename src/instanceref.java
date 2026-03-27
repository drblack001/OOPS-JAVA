interface Message {
    void display();
}

class Hello {
    void sayHello() {
        System.out.println("Hello from instance method");
    }
}

public class instanceref {
    public static void main(String[] args) {
        
        Hello obj = new Hello();
        Message m = obj::sayHello;
        m.display();
    }
}