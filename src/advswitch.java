import java.util.*;

public class advswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String s = switch (st) {
            case "Admin", "admin" -> "full access";
            case "User" ,"user"-> "Limited access";
            case "guest","Guest" -> "read only access";
            case "other","Other" -> "No access";
            default -> "Invalid input";
        };
        System.out.println(s);
    }
}
