import java.util.Scanner;
public class VanyaAndFence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }
        sc.nextLine();
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]<=h){
                count++;
            }
            else{
                count +=2;
            }
        }

        System.out.println(count);
    }
}
