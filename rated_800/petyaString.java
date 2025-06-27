package rated_800;
import java.util.*;
public class petyaString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        int result = 0;
        if(ac.length==bc.length){
            for(int i=0;i<ac.length;i++){
                if(ac[i]<bc[i]){
                    result = -1;
                    break;
                }

                if(ac[i]>bc[i]){
                    result = 1;
                    break;
                }
            }

            System.out.println(result);

        }

        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/112/problem/A