package rated_800;
import java.util.*;
public class magnets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String prev = sc.nextLine();

        int groups = 1;

        for(int i=1;i<t;i++){
            String curr = sc.nextLine();

            if(!curr.equals(prev)){
                groups++;
            }

            prev = curr;
        }

        System.out.println(groups);
        sc.close();
    }
}
//https://codeforces.com/contest/344/problem/A