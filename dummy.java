import java.util.*;
public class dummy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
            result.append(s[i]);
        }

    }
}
