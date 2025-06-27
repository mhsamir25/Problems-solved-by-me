package rated_800;
import java.util.*;
public class Translation {
    public static boolean equal(boolean[] arr){
        for(boolean b: arr){
            if(!b){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toLowerCase().toCharArray();
        char[] t = sc.nextLine().toLowerCase().toCharArray();
        boolean[] flag = new boolean[s.length];

        if(s.length == t.length){
            for(int i = 0;i<s.length;i++){
                if(s[i] == (t[t.length-i-1])){
                    flag[i] = true;
                }
                else{
                    flag[i]=false;
                }
            }

            if(equal(flag)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/41/problem/A
