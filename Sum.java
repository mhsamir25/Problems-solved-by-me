import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <String> result = new ArrayList<>();
        while(t-- >0){
            int[] arr = new int[3];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]>=0 && arr[0]<=20 && arr[1]>=0 && arr[1]<=20 && arr[2]>=0 && arr[2]<=20){
                Arrays.sort(arr);
                if(arr[0]+arr[1]==arr[2]){
                    result.add("YES");
                }
                else{
                    result.add("NO");
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }

        for(String s: result){
            System.out.println(s);
        }
    }
}
