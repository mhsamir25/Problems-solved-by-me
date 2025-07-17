package rated_800;
import java.util.*;
public class CandiesAndTwoSisters {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            double n = sc.nextDouble();
            int result = (int) Math.floor((n-1)/2);

            System.out.println(result);
        }
        sc.close();
    }
}
