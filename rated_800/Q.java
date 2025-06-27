package rated_800;
import java.util.Scanner;
public class Q {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();

        char[] ch = sc.nextLine().toUpperCase().toCharArray();
        for(int time=0; time<t;time++){
            for(int i=0;i<n-1;i++){
                if(ch[i]=='B' && ch[i+1]=='G'){
                    ch[i]='G';
                    ch[i+1]='B';
                    i++;
            }
        }
        }
        
        System.out.println(new String(ch));
        sc.close();
    }
}
//https://codeforces.com/contest/266/problem/B