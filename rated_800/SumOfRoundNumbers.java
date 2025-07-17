package rated_800;
import java.util.*;
public class SumOfRoundNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            int[] arr = new int[ch.length];

            for(int i=0;i<arr.length;i++){
                arr[i]=Character.getNumericValue(ch[i]);
            }

            ArrayList <Integer> a = new ArrayList<>();
            int summand=0;
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    double exponent = (double) arr.length-(i+1);
                    int power =  (int) Math.pow(10, exponent);
                    summand=arr[i]*power;
                    a.add(summand);
                    count++;
                }
            }
            System.out.println(count);
            for(int r:a){
                System.out.printf("%d ", r);
            }
            System.out.println();
        }
    }
}
