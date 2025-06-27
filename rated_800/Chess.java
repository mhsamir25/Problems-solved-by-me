package rated_800;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] token = s.split("");
        int countA = 0, countD = 0;
        if(token.length == a){
            for(int i = 0; i<token.length;i++){
                if(token[i].equals("A")){
                    countA++;
                }
                else if(token[i].equals("D")){
                    countD++;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }

            if(countA>countD){
                System.out.println("Anton");
            }

            else if(countD>countA){
                System.out.println("Danik");
            }

            else{
                System.out.println("Friendship");
            }
        }
        sc.close();
    }
}
//https://codeforces.com/contest/734/problem/A