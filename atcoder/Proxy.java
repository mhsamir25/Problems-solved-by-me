package atcoder;
import java.util.*;
public class Proxy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] box = new int[x];
        int[] ball = new int[y];
        

        for(int i=0;i<y;i++){
            ball[i]=sc.nextInt();
        }
        
        ArrayList <Integer> results = new ArrayList<>();
        for(int i =0;i<y;i++){
            if(ball[i]>=1){
                box[ball[i]-1]++;
                results.add(ball[i]);
            }
            
            else if(ball[i]==0){
                int min = box[0], num = 0;
                for(int j =1;j<box.length;j++){
                    if(box[j]<min){
                        min = box[j];
                        num = j;
                    }
                }

                box[num]++;
                results.add(num+1);

            }

            else{
                System.out.println("Invalid Input");
            }
        }

        for(int r: results){
            System.out.print(r+" ");
        }
        System.out.println();
        sc.close();
    }
}
//https://atcoder.jp/contests/abc410/tasks/abc410_b