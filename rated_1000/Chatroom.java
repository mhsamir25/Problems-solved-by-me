package rated_1000;
import java.util.Scanner;
public class Chatroom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = "hello";
        int index = 0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==target.charAt(index)){
                index++;
            }
            if(index == target.length()){
                break;
            }
        }

        if(index == target.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/58/problem/A