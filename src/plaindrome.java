public class plaindrome {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int sum=0;
        int temp=a;
        while (a>0) {
            int rem = a%10;
            sum = sum*10+rem;
            a=a/10;
        }
        if (temp==sum) {
            System.out.println("number is plaindrome");
        }
        else{
            System.out.println("number is not plaindrome");
        }
    }
}
