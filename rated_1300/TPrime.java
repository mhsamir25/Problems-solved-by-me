package rated_1300;
import java.util.*;

public class TPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 1000000;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i * i <= max; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= max; j += i){
                    isPrime[j] = false;
                }
            }
        }

        int n = sc.nextInt();
        while(n-- > 0){
            long x = sc.nextLong();
            long sqrt = (long)Math.sqrt(x);

            
            if(sqrt * sqrt == x && isPrime[(int)sqrt]){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
//https://codeforces.com/problemset/problem/230/B