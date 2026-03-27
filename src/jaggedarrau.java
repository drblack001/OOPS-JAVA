import java.util.*;
public class jaggedarrau {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int r= sc.nextInt();
        int [][] a= new int[r][];
        for (int i=0;i<r;i++) {
            System.out.println("enter the nuber of element in current row");
            int c= sc.nextInt();
            a[i]=new int[c];
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
