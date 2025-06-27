import java.util.*;
public class Guy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int p = sc.nextInt();
        int[] x = new int[p];
        for(int i=0;i<p;i++){
            x[i]=sc.nextInt();
        }
        sc.nextLine();
        int q = sc.nextInt();
        int[] y = new int[q];
        for(int i = 0;i<q;i++){
            y[i]=sc.nextInt();
        }

        int[] combine = new int[x.length+y.length];

        System.arraycopy(x, 0, combine, 0, x.length);
        System.arraycopy(y, 0, combine, x.length, y.length);

        Arrays.sort(combine);
        Set <Integer> results = new HashSet<>();

        for(int i=0;i<combine.length;i++){
            results.add(combine[i]);
        }


        if(n==results.size()){
            System.out.println("I become the guy.");
        }

        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
