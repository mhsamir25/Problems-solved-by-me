package random;
import java.util.*;
public class five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1){
            System.out.println("NO");
            sc.close();
            return;
        }

        while(n%5==0){
            n /= 5;
        }

        if(n==1){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//n is a given number...determine if n can be expressed as the power of 5