package rated_800;
import java.util.*;
public class Mathematician {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        ArrayList <String> results = new ArrayList<>();
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    results.add("1");
                }
                else{
                    results.add("0");
                }
            }
            
            for(String r: results){
                System.out.print(r);
            }
        }
        sc.close();
    }
}
//https://codeforces.com/contest/61/problem/A