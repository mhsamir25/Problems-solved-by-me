package rated_800;
import java.util.*;
public class DontTryToCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine(), s = sc.nextLine();
            if(x.length()==n && s.length()==m){
            boolean found = false;
            int count = 0;

            while(x.length()<=25){
                if(x.contains(s)){
                    found = true;
                    break;
                }
                
                x += x;
                count++;
                
            }

            System.out.println(found? count: -1);
            sc.close();
        }
        }
    }
}
