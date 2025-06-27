import java.util.*;
public class YESorYES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <String> result = new ArrayList<>();

        for(int i =0;i<t;i++){
            String s = sc.nextLine().toUpperCase();
            if(s.equals("YES")){
                result.add("YES");
            }
            else{
                result.add("NO");
            }
        }

        for(String r: result){
            System.out.println(r);
        }
    }
}
