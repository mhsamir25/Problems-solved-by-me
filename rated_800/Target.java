package rated_800;
import java.util.Scanner;
public class Target{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- >0){
            int total = 0;

            for(int i=0;i<10;i++){
                String row = sc.nextLine();

                for(int j=0;j<10;j++){
                    if(row.charAt(j)=='X'){
                        int ring = Math.min(Math.min(i, 9-i),Math.min(j, 9-j));
                        total += ring+1;
                    }
                }
            }

            System.out.println(total);
        }
        sc.close();
    }
}
//https://codeforces.com/contest/1873/problem/C