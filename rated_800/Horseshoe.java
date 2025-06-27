package rated_800;
import java.util.*;
public class Horseshoe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set <Integer> result = new HashSet<>();
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
            result.add(arr[i]);
        }

        int r = 4-result.size();
        System.out.println(r);
        sc.close();
    }    
}
//https://codeforces.com/contest/228/problem/A