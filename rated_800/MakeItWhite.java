package rated_800;
import java.util.*;
public class MakeItWhite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Integer> result = new ArrayList<>();
        while(t-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            if(ch.length==n){
            int left = 0;
            int right = 0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]=='B'){
                    left = i;
                    break;
                }
            }

            for(int i=ch.length-1;i>=0;i--){
                if(ch[i]=='B'){
                    right = i;
                    break;
                }
            }

            result.add((right+1)-left);
        }
        }

        for(int r:result){
            System.out.println(r);
        }
        sc.close();
    }
}
