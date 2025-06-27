import java.util.Scanner;
public class Year {

    public static boolean hasAllDistinct(int year){
        String str = Integer.toString(year);
        boolean[] seen = new boolean[10];
        for(char ch: str.toCharArray()){
            int digit = ch - '0';
            if(seen[digit]){
                return false;
            }
            seen[digit]= true;
            
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.nextLine();
        int nextYear = y+1;

        while(!hasAllDistinct(nextYear)){
            nextYear++;
        }

        System.out.println(nextYear);
        
        
    }
    
}
