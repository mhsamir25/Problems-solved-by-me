import java.util.Scanner;
public class Capital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] token = s.split("");
        String a = token[0].toUpperCase();
        
        StringBuilder result = new StringBuilder();
        if(token.length>0){
            result.append(a);
            for(int i=1;i<=token.length-1;i++){
            result.append(token[i]);
        }
        }
        

        System.out.println(result);
        sc.close();
    }
}
