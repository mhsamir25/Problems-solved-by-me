import java.util.Scanner;
public class GoodKid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            if(n>=1 && n<=9){
                int[] numbers = new int[n];
                for(int l=0;l<numbers.length;l++){
                    numbers[l]=sc.nextInt();
                }
                
                int b = 0;
                
                for(int j=1;j<numbers.length;j++){
                    if(numbers[j]<numbers[b]){
                        
                        b = j;
                    }
                }
                numbers[b] +=1;
                int result = 1;
                for(int k = 0;k<numbers.length;k++){
                    result *= numbers[k];
                }
                System.out.println(result);
            }
        }
    }
}
