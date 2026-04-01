import java.util.*;
public class encodingdecodeing {
    public static void main(String[] args) {
        String org ="Hell";
        System.out.println(org);
        String encodeString = Base64.getEncoder().encodeToString(org.getBytes());
        System.out.println(encodeString);
        byte[] decodeString= Base64.getDecoder().decode(encodeString.getBytes());
        System.out.println(decodeString);
        String s = new String(decodeString);
        System.out.println(s);
    }
}
