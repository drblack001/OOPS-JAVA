import java.util.*;

public class exception {
    int []arr={21,34,45,67,89};
    int idx,a,ans= 0;
    
    public exception() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index and value");
        try {
            idx = sc.nextInt();
            a= sc.nextInt();
            ans =sc.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured: " + e);
        }
        finally{
            System.out.println("fianlly block");
        }
        System.out.println("Ans: " + ans);
        sc.close();
    }
}
