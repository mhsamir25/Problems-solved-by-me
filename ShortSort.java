import java.util.Scanner;
public class ShortSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] s = new String[t];
        for(int i=0;i<t;i++){
            s[i]=sc.nextLine();
        }

        for(int i=0;i<s.length;i++){
            switch (s[i]) {
                case "abc":
                    System.out.println("YES");
                    break;
                case "acb":
                    System.out.println("YES");
                    break;
                case "bac":
                    System.out.println("YES");
                    break;
                case "bca":
                    System.out.println("NO");
                    break;
                case "cab":
                    System.out.println("NO");
                    break;
                case "cba":
                    System.out.println("YES");
                    break;
                default: System.out.println("Invalid input");
                    break;
            }
        }
    }
}
