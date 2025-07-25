package rated_800;
import java.util.*;
public class NewYearAndHurry {
    public static int number(int a){
        if(a==0){
            return 0;
        }
        return (5*a)+number(a-1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        
        for(int i=1;i<=n;i++){
            int time = number(i);
            if(time>(240-k)){
                break;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
