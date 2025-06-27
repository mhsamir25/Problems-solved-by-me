import java.util.Scanner;
public class Drinks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] num = new double[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        double total =   0;
        for(int i=0;i<n;i++){
            total = total+num[i];
        }

        double result = (total/(n*100))*100;
        System.out.printf("%.12f\n", result);
    }
}
