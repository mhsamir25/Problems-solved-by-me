package rated_800;
import java.util.*;
public class Easy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p = sc.nextInt();
        sc.nextLine();
        Set <Integer> results = new HashSet<>();
        for(int i = 0;i<p;i++){
            int n = sc.nextInt();
            results.add(n);
        }

        if(results.size()==2){
            System.out.println("HARD");
        }

        else if(results.size()==1){
            System.out.println("EASY");
        }

        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
//https://codeforces.com/contest/1030/problem/A