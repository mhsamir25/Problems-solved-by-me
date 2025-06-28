package rated_800;
import java.util.*;
public class PlusOrMinus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList <Character> result = new ArrayList<>();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>=1 && a<=9 && b>=1 && b<=9 && c>= -8 && c<=18){
                if(a+b==c){
                    result.add('+');
                }
                else if(a-b==c){
                    result.add('-');
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Invalid input: Out of range");
            }
        }

        for(char ch: result){
            System.out.println(ch);
        }
        sc.close();
    }
}
