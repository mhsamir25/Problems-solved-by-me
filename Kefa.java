import java.util.*;
public class Kefa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max_l = 1, curr_l = 1;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                curr_l++;
                max_l = Math.max(max_l, curr_l);
            }
            else{
                curr_l = 1;
            }
        }

        System.out.println(max_l);
    }
}
