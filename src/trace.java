import java.util.*;
public class trace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int a =sc.nextInt();
        System.out.println("Enter the number of columns ");
        int b =sc.nextInt();
        int [][]arr= new int[a][b];
        System.out.println("Enter the elements of array 1");
        for (int i=0;i<a;i++) {
            for (int j=0;j<b;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++) {
                System.out.println(arr[i][j]);
            }
        }
    }    
}
