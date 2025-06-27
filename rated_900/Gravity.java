package rated_900;
import java.util.*;
public class Gravity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[0]);

        for(int i=1;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        sc.close();
    }
}
//https://codeforces.com/contest/405/problem/A