package rated_800;
import java.util.*;
public class ILoveUsername {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count = 0;
        int current_max = arr[0];
        int current_min = arr[0];

        for(int i=1;i<=n-1;i++){
            if(arr[i]>current_max){
                count++;
                current_max = arr[i];
            }

            else if(arr[i]<current_min){
                count++;
                current_min = arr[i];
            }
        }

        System.out.println(count);
        sc.close();
    }
}
