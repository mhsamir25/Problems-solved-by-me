package rated_800;
import java.util.Scanner;
public class Bit{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for(int i = 0;i<a;i++){
            String s = sc.nextLine();
            s.trim();


            if(s.equals("++X") || s.equals("X++")){
            x++;
            }
            if(s.equals("--X") || s.equals("X--")){
            x--;
            }
        }

        System.out.println(x);
        sc.close();
    }
}
//https://codeforces.com/contest/282/problem/A