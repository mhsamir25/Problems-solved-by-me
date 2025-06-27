package rated_800;
import java.util.Scanner;
public class BoyOrGirl{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userID = scanner.nextLine().trim().toLowerCase();
        boolean[] seen =  new boolean[26];
        int count = 0;
        if(userID.length()>=0 && userID.length()<=100 ){
            
            for (int i = 0; i < userID.length(); i++) {
            char ch = userID.charAt(i);
            int index = ch - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
        if(count%2 == 0){
                System.out.println("CHAT WITH HER!");
            }
            else{
                System.out.println("IGNORE HIM!");
            }
            
        }
        scanner.close();
    }
}

//Problem Link: https://codeforces.com/contest/236/problem/A