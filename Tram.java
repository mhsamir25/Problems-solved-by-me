import java.util.Scanner;
public class Tram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
    
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
            b[i]=sc.nextInt();
            
        }
        
        if(a[0]!=0 || b[n-1]!=0){

            System.out.println("Invalid input give input again");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            
                b[i]=sc.nextInt();
            
                }
        }
        
        int[] total = new int[n];
        total[0]=a[0]+b[0];

        for(int i=1;i<n;i++){
            total[i]=total[i-1]-a[i]+b[i];
        }
        
        int max = total[0];
        for(int i=1;i<total.length;i++){
            if(total[i]>max){
                max = total[i];
            }
        }

        System.out.println(max);
    }
}
