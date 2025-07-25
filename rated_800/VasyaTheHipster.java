package rated_800;
import java.util.*;
public class VasyaTheHipster {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = Math.min(a, b);

        int t = Math.abs(a-b)/2;

        System.out.println(d+" "+t);

        sc.close();
    }
}
