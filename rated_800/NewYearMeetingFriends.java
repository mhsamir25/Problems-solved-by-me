package rated_800;
import java.util.*;
public class NewYearMeetingFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int median = arr[1];

        int result = Math.abs(median-arr[0])+Math.abs(median-arr[2]);
        System.out.println(result);
        sc.close();
    }
}
//https://codeforces.com/problemset/problem/723/A
