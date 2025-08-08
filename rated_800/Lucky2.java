package rated_800;
import java.util.*;
public class Lucky2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> result = new ArrayList<>();
        while(t-- >0){
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            int[] num = new int[ch.length];
            for(int i=0;i<ch.length;i++){
                num[i]= Character.getNumericValue(ch[i]);
            }
            int sum1 = num[0]+num[1]+num[2];
            int sum2 = num[3]+num[4]+num[5];

            if(sum1==sum2){
                result.add("YES");
            }
            else{
                result.add("NO");
            }
        }
        for(String r: result){
            System.out.println(r);
        }
        sc.close();
    }
}
