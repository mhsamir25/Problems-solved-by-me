package random;
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
        sc.close();
    }
}
/*
 * A company operates multiple drones for making deliveries. Each drone performs several deliveries in a day, and the fuel consumption (in milliliters) for each delivery is recorded.

You are given:

The number of drones d.

For each drone, the number of deliveries r, followed by r integers representing the fuel consumed in each delivery.

Your task is to determine the lowest fuel consumption among all the minimum consumptions of each drone. That is, for each drone, find the minimum fuel used in its deliveries, then output the smallest of these minimum values across all drones.

📥 Input Format:
The first line contains an integer d — the number of drones.

For each of the next d lines:

The first number is an integer r — the number of deliveries made by that drone.

Followed by r integers — the fuel consumptions for each delivery.

📤 Output Format:
Print a single integer — the smallest fuel consumption among all drones' minimums.

📌 Sample Input:
3
4 300 250 400 310
3 500 230 340
2 280 270
✅ Sample Output:
230
 */