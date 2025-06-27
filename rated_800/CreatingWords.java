package rated_800;
import java.util.*;
public class CreatingWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<t;i++){
            String[] a = sc.nextLine().split(" ");
            char[] ch1 = a[0].toCharArray();
            char[] ch2 = a[1].toCharArray();

            char temp = ch1[0];
            ch1[0]=ch2[0];
            ch2[0]=temp;
            
            String newA = new String(ch1);
            String newB = new String(ch2);
            
            System.out.println(newA + " "+ newB);
        }
        sc.close();
    }
}
//https://codeforces.com/contest/1985/problem/A