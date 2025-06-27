import java.util.Scanner;
public class Bear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int years = 0;
        while(l<=b){
            l *= 3;
            b *= 2;
            years++;
        }
        System.out.println(years);
        sc.close();
    }
}
