import java.util.Scanner;
public class Physicist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            z[i]=sc.nextInt();
        }

        int totalx = 0, totaly=0, totalz =0;
        for(int i=0;i<n;i++){
            totalx += x[i];
            totaly += y[i];
            totalz += z[i];
        }

        if(totalx==0 && totaly==0 && totalz==0){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
        
    }
}
