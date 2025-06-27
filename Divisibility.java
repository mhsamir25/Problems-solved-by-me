import java.util.*;
public class Divisibility {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Integer> result = new ArrayList<>();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int remainder = a%b;
            int moves = (remainder==0)? 0: (b-remainder);
            result.add(moves);
        }

        for(int r: result){
            System.out.println(r);
        }
    }
}
