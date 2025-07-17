package rated_800;
import java.util.*;
public class OneDigitOnly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Integer> result = new ArrayList<>();
        while(t-- >0){
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            int[] arr = new int[ch.length];

            for(int i=0;i<arr.length;i++){
                arr[i]=Character.getNumericValue(ch[i]);
            }

            int min = arr[0];

            for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }

            result.add(min);


        }

        for(int r: result){
            System.out.println(r);
        }
        sc.close();
    }
}
