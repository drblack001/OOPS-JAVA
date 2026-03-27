// wap to check whether a number is plaindrome or nor using command line argument
public class abc {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num =sc.nextInt();
        int a  = Integer.parseInt(args[0]);
        int count=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if (count==2) {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }


    }
}
