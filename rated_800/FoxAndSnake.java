package rated_800;
import java.util.*;
public class FoxAndSnake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        for(int row=1;row<=n;row++){
            if(row%2==1){
                for(int col=1;col<=m;col++){
                System.out.print("#");
                }
                System.out.println();
            }
            else{
                if(row%4==2){
                    for(int col=1;col<m;col++){
                        System.out.print(".");
                    }
                    System.out.print("#");
                    System.out.println();
                }
                else{
                    System.out.print("#");
                    for(int col=2;col<=m;col++){
                        System.out.print(".");
                    }
                    System.out.println();
                }
            }

        }
        sc.close();
    }
}
