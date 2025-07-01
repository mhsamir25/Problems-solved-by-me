package rated_800;
import java.util.*;
public class SquareString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <String> result = new ArrayList<>();
        while(t-- >0){
            String str = sc.nextLine();
            if (str.length() % 2 != 0) {
                result.add("NO");
                continue;
            }
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();

            for(int i=0;i<(str.length()/2);i++){
                a.append(str.charAt(i));
            }
            for(int i=(str.length()/2);i<str.length();i++){
                b.append(str.charAt(i));
            }

            if(a.toString().equals(b.toString())){
                result.add("YES");
            }
            else{
                result.add("NO");
            }
        }
        for(String s: result){
            System.out.println(s);
        }
        sc.close();
    }
}
