import java.util.*;
public class Drone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        sc.nextLine();
        int[] m = new int[d];
        for(int i=0;i<d;i++){
            int r = sc.nextInt();
            
            int[] arr = new int[r];
            for(int j=0;j<r;j++){
                arr[j]=sc.nextInt();
            }
            int min = arr[0];
            for(int j=1;j<r;j++){
                if(arr[j]<min){
                    min=arr[j];
                    
                }
            }
            m[i]= min;
        }

        int nmin = m[0];
        for(int i=0;i<d;i++){
            if(m[i]<nmin){
                nmin = m[i];
            }
        }
        System.out.println(nmin);
    }
}
