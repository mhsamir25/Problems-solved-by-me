package rated_800;
import java.util.*;
public class AtiliasProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Integer> result = new ArrayList<>();
        while(t-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            if(str.length()==n){
            char maxChar = 'a';
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>maxChar){
                    maxChar = str.charAt(i);
                }
            }

            int a = maxChar - 'a'+1;
            result.add(a);
        }
        else{
            System.out.println("Invalid input");
        }
        }

        for(int r: result){
            System.out.println(r);
        }
        sc.close();
    }
}
