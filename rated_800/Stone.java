package rated_800;
import java.util.Scanner;
public class Stone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int removals = 0;
        for(int i = 0; i< a-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                removals++;
            }
        }
        System.out.println(removals);
        sc.close();
    }
}
//https://codeforces.com/contest/266/problem/A