package rated_800;
import java.util.Scanner;

public class LongWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] result = new String[a];
        sc.nextLine();
        if(a>=1 && a<=100){
            for(int i = 0; i<a;i++){
                String s = sc.nextLine();

                if(s.length()<=10){
                    result[i]=s;
                }

                else{
                    result[i] = ""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
                }
            }
            for(String res: result){
                System.out.println(res);
            }
            }
            sc.close();
        }
    }
//https://codeforces.com/contest/71/problem/A