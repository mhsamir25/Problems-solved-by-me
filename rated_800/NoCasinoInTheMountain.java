package rated_800;
import java.util.*;

public class NoCasinoInTheMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int hikes = 0;
            int i = 0;
            while (i <= n - k) {
                boolean canHike = true;
                for (int j = i; j < i + k; j++) {
                    if (a[j] != 0) {
                        canHike = false;
                        break;
                    }
                }
                if (canHike) {
                    hikes++;
                    i += k + 1; 
                } else {
                    i++;
                }
            }
            result.add(hikes);
        }

        for(int r:result){
            System.out.println(r);
        }
        sc.close();
    }
}
