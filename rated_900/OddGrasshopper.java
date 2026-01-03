package rated_900;
import java.util.*;

public class OddGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            sb.append(getFinalPosition(x, n)).append("\n");
        }

        System.out.print(sb);
        sc.close();
    }

    static long getFinalPosition(long x, long n) {
        long q = n / 4;
        int r = (int)(n % 4);
        
        long result = x;
        if (x % 2 == 0) {
            result += 2 * q;
            if (r == 1) result -= 1;
            else if (r == 2) result += 1;
            else if (r == 3) result -= 2;
        } else {
            result -= 2 * q;
            if (r == 1) result += 1;
            else if (r == 2) result -= 1;
            else if (r == 3) result += 2;
        }
        return result;
        
    }
    
}
