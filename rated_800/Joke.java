package rated_800;
import java.util.*;

public class Joke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();
        String s2 = sc.nextLine().toUpperCase();
        String s3 = sc.nextLine().toUpperCase();

        Map<Character, Integer> name = new HashMap<>();
        Map<Character, Integer> pile = new HashMap<>();

        for(char c: (s1+s2).toCharArray()){
            name.put(c, name.getOrDefault(c, 0)+1);
        }

        for(char c: s3.toCharArray()){
            pile.put(c, pile.getOrDefault(c, 0)+1);
        }

        if(name.equals(pile)){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/141/problem/A