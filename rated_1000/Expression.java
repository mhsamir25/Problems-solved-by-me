package rated_1000;
import java.util.*;
public class Expression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        int c = sc.nextInt();
        sc.nextLine();

        int[] r = new int[7];
        if (a >= 1 && a <= 10 && b >= 1 && b <= 10 && c >= 1 && c <= 10){
        r[0] = a+(b*c);
        r[1] = a*(b+c);
        r[2] = a*b*c;
        r[3] = (a+b)*c;
        r[4] = a + b + c;
        r[5] = a * b + c;
        r[6] = a+b+c;
        
        int max = r[0];

        for(int i=1;i<r.length;i++){
            if(r[i]>max){
                max = r[i];
            }
        }
        System.out.println(max);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/479/problem/A