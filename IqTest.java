import java.util.*;
public class IqTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int even_c = 0, odd_c = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_c++;
            }
            else{
                odd_c++;
            }
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(even_c>odd_c){
                if(arr[i]%2 != 0){
                    index = i+1;
                }
            }
            else{
                if(arr[i]%2==0){
                    index = i+1;
                }
            }
        }

        System.out.println(index);
    }
}
