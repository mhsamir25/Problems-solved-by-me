import java.util.Scanner;
public class Word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] token = s.split("");
        if(token.length>=1 && token.length<=100){
        char[] ch =  new char[token.length];
        for(int i = 0; i<token.length; i++){
            ch[i] = s.charAt(i);
        }
        int u = 0, sm = 0;
        for(int i = 0; i<token.length;i++){
            if(Character.isUpperCase(ch[i])){
                u++;
            }
            if(Character.isLowerCase(ch[i])){
                sm++;
            }
        }
        
        if(u>sm){
            System.out.println(s.trim().toUpperCase());
        }
        else{
            System.out.println(s.trim().toLowerCase());
        }
    }
    }
}
