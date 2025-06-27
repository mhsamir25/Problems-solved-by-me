package rated_800;
import java.util.*;
public class Function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        if(n%2==0){
            System.out.println(n/2);
        }

        else{
            System.out.println(-(n+1)/2);
        }
        sc.close();
    }
}
//https://codeforces.com/contest/486/problem/A