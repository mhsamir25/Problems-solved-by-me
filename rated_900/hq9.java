package rated_900;
import java.util.*;
public class hq9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='H' || ch[i] == 'Q' || ch[i] == '9'){
                System.out.println("YES");
                sc.close();
                return;
            }
        }

        System.out.println("NO");
        sc.close();
    }
}
//https://codeforces.com/contest/133/problem/A