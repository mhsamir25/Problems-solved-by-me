package rated_800;
import java.util.Arrays;
import java.util.Scanner;

public class hmath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] tokens = s.split("\\+");
        int[] number =  new int[tokens.length];
        for(int i = 0; i<tokens.length; i++){
            number[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(number);

        StringBuilder result = new StringBuilder();
        for(int i =0; i<number.length;i++){
            result.append(number[i]);
            if(i<number.length-1){
                result.append(("+"));
            }
        }
        System.out.println(result);
        sc.close();
    }
}
//Problem link: https://codeforces.com/contest/339/problem/A