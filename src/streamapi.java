import java.util.*;
import java.util.stream.Collectors;

public class streamapi {

    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<Integer>(10);
        System.out.println("enter values");
        for(int i=0 ;i<10;i++){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            obj.add(n);
        }
        System.out.println("sorted values:\n");
        obj.stream().sorted().forEach(X->System.out.println(X));
        Set<Integer> SortedObj= obj.stream().sorted().collect(Collectors.toSet());
        // System.out.println(SortedObj);
        System.out.println("filtered obj \n");
        SortedObj.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
    }
}