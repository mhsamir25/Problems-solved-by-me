package rated_800;
import java.util.*;
public class PoliceRecruits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int aOfficers = 0;
        int uCrimes = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                aOfficers += arr[i];
            }
            else if(arr[i]== -1){
                if(aOfficers>0){
                    aOfficers--;
                }
                else{
                    uCrimes++;
                }
            }
        }

        System.out.println(uCrimes);
        sc.close();
    }
}
