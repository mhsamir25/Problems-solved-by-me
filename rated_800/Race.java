package rated_800;
import java.util.*;
public class Race {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> result = new ArrayList<>();
        while(t-- >0){
            double a = sc.nextDouble();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double max;
            if(x>y){
                max = x;
            }
            else{
                max = y;
            }
            boolean flag = false;
            for(int i=1;i<=max;i++){
                if(Math.abs(i-x)<Math.abs(a-x) && Math.abs(i-y)<Math.abs(a-y)){
                    flag = true;
                }
            }

            if(flag){
                result.add("YES");
            }
            else{
                result.add("NO");
            }
        }

        for(String s:result){
            System.out.println(s);
        }
        sc.close();
    }
}
