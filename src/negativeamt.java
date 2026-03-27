import java.util.Scanner;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();
            if (amount < 0) {
                throw new NegativeAmountException("Amount cannot be negative!");
            }
            System.out.println("Amount accepted: " + amount);
        } catch (NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}