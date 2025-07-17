package rated_800;
import java.util.*;
public class RestoringThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<4;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        Arrays.sort(arr);
        int a = max-arr[2];
        int b = arr[0]-a;
        int c = arr[1]-a;

        System.out.printf("%d %d %d", a, b, c);
        sc.close();
    }
}
