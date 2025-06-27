import java.util.*;
public class Pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        String s = sc.nextLine().trim().toLowerCase();
        char[] ch = s.toCharArray();
        Set <Character> result = new HashSet<>();
        if(s.length()==n){
            for(int i=0;i<ch.length;i++){
                result.add(ch[i]);
            }

            if(result.size()==26){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
