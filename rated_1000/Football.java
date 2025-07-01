package rated_1000;
import java.util.*;
public class Football {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map <String, Integer> result = new HashMap<>();

        for(int i=0;i<n;i++){
            String team = sc.nextLine();

            result.put(team, result.getOrDefault(team, 0)+1);
        }

        String winner = "";
        int max = 0;

        for(Map.Entry<String, Integer> entry: result.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println(winner);
        sc.close();
    }
}
