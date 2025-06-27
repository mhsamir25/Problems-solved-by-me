import java.util.Scanner;
public class domino {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int d = m*n/2;
        System.out.println(d);
        sc.close();
    }
}
