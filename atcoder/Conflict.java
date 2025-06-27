package atcoder;
import java.util.*;
public class Conflict {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.length()==n && b.length()==n){
            for(int i=0;i<n;i++){
                if(a.charAt(i)=='o'&& b.charAt(i)=='o'){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
//https://atcoder.jp/contests/abc409/tasks/abc409_a