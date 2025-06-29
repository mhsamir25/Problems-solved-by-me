package rated_800;
import java.util.*;
public class LoveStory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Integer> result = new ArrayList<>();
        while(t-- >0){
            String s = sc.nextLine();
            String n = "codeforces";
            int count = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==n.charAt(i)){
                    count++;
                }
            }

            result.add(10-count);
        }

        for(int r: result){
            System.out.println(r);
        }
        sc.close();
    }
}
