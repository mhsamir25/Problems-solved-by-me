package rated_900;
import java.util.Scanner;
public class Football {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String situation = sc.nextLine();

        if(situation.contains("0000000")||situation.contains("1111111")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/96/problem/A