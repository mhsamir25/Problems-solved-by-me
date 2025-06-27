package rated_1000;
import java.util.Scanner;

public class StringTask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toLowerCase();
        
        StringBuilder result =  new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e'|| c == 'i' ||c == 'o' ||c == 'u' ||c == 'y'){
                continue;
            }
            result.append(".").append(c);
            
        }

        System.out.println(result);
        sc.close();
    }
}
//https://codeforces.com/contest/118/problem/A