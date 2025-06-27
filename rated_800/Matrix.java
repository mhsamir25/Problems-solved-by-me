package rated_800;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = 0, col=0;
        int value=0, i, j;
        for(i = 0;i<5;i++){
            for(j = 0;j<5;j++){
                value = sc.nextInt();
                if(value == 1){
                row = i+1;
                col = j+1;
            }
            }
        }

        int result = Math.abs(row-3)+Math.abs(col-3);
        System.out.println(result);
        sc.close();
    }
}
//https://codeforces.com/contest/263/problem/A