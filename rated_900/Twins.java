package rated_900;
import java.util.*;
public class Twins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] coin = new Double[n];
        for(int i=0;i<n;i++){
            coin[i]=sc.nextDouble();
        }

        double total = 0;
        for(int i =0;i<coin.length;i++){
            total += coin[i];
        }

        Arrays.sort(coin, Collections.reverseOrder());
        int count=0;
        double mySum=0;
        for(int i =0;i<coin.length;i++){
                mySum += coin[i];
                count++;

                if(mySum>(total/2)){
                    break;
                }
            
        }

        System.out.println(count);
        sc.close();
    }
}
//https://codeforces.com/contest/160/problem/A