package rated_800;
import java.util.*;
public class Round {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k>=1 && k<=n && n<=50){
            int[] race = new int[n];

            for(int i=0;i<n;i++){
            race[i]=sc.nextInt();
            }
            int count =0;

            for(int i=0;i<n;i++){
                if(race[i]>=race[k-1] && race[i]>0){
                count++;
            }
            }

            System.out.println(count);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
}
}
//https://codeforces.com/contest/158/problem/A