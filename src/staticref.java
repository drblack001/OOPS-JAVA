interface Operation {
    int calculate(int a, int b);
}

class MathUtils {
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class staticref {
    public static void main(String[] args) {
        
        Operation op = MathUtils::multiply;

        System.out.println("Result: " + op.calculate(4, 5));
    }
}