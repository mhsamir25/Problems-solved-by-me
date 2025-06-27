package atcoder;
import java.util.*;
public class G1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] age = new int[n];

        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();
        }

        int count = 0;
        int k = sc.nextInt();
        for(int i =0;i<age.length;i++){
            if(k<=age[i]){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
//https://atcoder.jp/contests/abc410/tasks/abc410_a