package rated_1200;
import java.util.*;
public class VanyaLanterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        if (n == 1) {
            double edgeLeft = arr[0] - 0;
            double edgeRight = l - arr[0];
            double result = Math.max(edgeLeft, edgeRight);
            System.out.printf("%.10f", result);
            sc.close();
            return;
        }

        int[] max = new int[n-1];
        for(int i=0;i<max.length;i++){
            max[i]=arr[i+1]-arr[i];
        }

        int m = max[0];
        for(int i=1;i<max.length;i++){
            if(max[i]>m){
                m = max[i];
            }
        }
        double maxGap = m / 2.0; 
        double leftGap = arr[0] - 0;
        double rightGap = l - arr[n - 1];

        double result = Math.max(maxGap, Math.max(leftGap, rightGap));

        System.out.printf("%.10f", result);
        sc.close();
    }
}
//https://codeforces.com/contest/492/problem/B