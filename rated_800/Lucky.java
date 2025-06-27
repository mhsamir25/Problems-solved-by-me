package rated_800;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String[] token = number.split("");
        int[] n = new int[token.length];
        for(int i = 0; i<token.length;i++){
            n[i]= Integer.parseInt(token[i]);
        }
        int count = 0;
        for(int i = 0;i<n.length;i++){
            if(n[i]==4||n[i]==7){
                count++;
            }
        }

        if(count==4 || count == 7){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/110/problem/A