import java.util.*;
public class Letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1, s.length()-1).trim();

        Set <String> set = new HashSet<>();

        if(!s.isEmpty()){
            String[] letters = s.split(", ");

            for(String l: letters){
                set.add(l);
            }
        }

        System.out.println(set.size());
    }
}
