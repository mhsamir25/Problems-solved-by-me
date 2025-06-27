import java.util.*;
public class Parade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();            
        }

        int max = a[0], max_index = 0;

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                max_index = i;
            }
        }

        int min = a[0], min_index = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]<=min){
                min = a[i];
                min_index = i;
            }
        }

        int swaps = max_index+(n-1-min_index);

        if(max_index>min_index){
            swaps--;
        }

        System.out.println(swaps);
    }
}