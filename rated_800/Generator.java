package rated_800;
import java.util.*;
public class Generator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <String> result = new ArrayList<>();
        while(t-- >0){
            int k = sc.nextInt();
            if(k%2==0){
                result.add("NO");
            }
            else{
                result.add("YES");
            }
        }

        for(String s: result){
            System.out.println(s);
        }
        sc.close();
    }
}
//https://codeforces.com/contest/2093/problem/A