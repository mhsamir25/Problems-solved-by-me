import java.util.Scanner;

public class Presents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int friend = sc.nextInt();
        sc.nextLine();
        int[] f = new int[friend];
        int[] results = new int[friend];
        for(int i=0;i<friend;i++){
            f[i]=sc.nextInt();
        }
        for(int i = 0; i<f.length;i++){
            results[f[i]-1]= i+1;
        } 
        
        for(int r: results){
            System.out.print(r+" ");
        }
        sc.close();
    }
}
