package rated_800;
import java.util.*;
public class PolyCarp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "3141592653589793238462643383279";
        char[] ch = s.toCharArray();
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Integer> result = new ArrayList<>();
        while(t-- >0){
            String a = sc.nextLine();
            char[] c = a.toCharArray();
            int count = 0;
            for(int i=0;i<c.length;i++){
                if(ch[i]==c[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            result.add(count);
        }

        for(int r:result){
            System.out.println(r);
        }
        sc.close();
    }
}
