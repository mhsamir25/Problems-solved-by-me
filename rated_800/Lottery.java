package rated_800;
import java.util.*;
public class Lottery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hun = n/100;
        n %= 100;
        int twenty = n/20;
        n%=20;
        int ten = n/10;
        n%=10;
        int five = n/5;
        n%=5;
        int ones = n/1;

        System.out.println(hun+twenty+ten+five+ones);
        sc.close();
    }
}
//https://codeforces.com/contest/996/problem/A