import java.util.Scanner;

public class LuckyDivision {
    public static boolean isLucky(int num){
        
        while(num>0){
            int digit = num%10;
            if(digit!=4 && digit != 7){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            if(isLucky(i) && n%i==0){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
