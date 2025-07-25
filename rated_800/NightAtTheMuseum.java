package rated_800;
import java.util.*;

public class NightAtTheMuseum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        int diff=0;

        if(ch[0]<='n'){
            diff += ch[0]-'a';
        }
        else{
            switch(ch[0]){
                case 'o': 
                    diff += 12;
                    break;

                case 'p':
                    diff += 11;
                    break;
                
                case 'q':
                    diff += 10;
                    break;
                case 'r':
                    diff += 9;
                    break;
                case 's':
                    diff+=8;
                    break;
                case 't':
                    diff += 7;
                    break;
                case 'u':
                    diff += 6;
                    break;
                case 'v':
                    diff+=5;
                    break;
                case 'w':
                    diff+=4;
                    break;
                case 'x':
                    diff +=3;
                    break;
                case 'y':
                    diff +=2;
                    break;
                case 'z':
                    diff +=1;
                    break;
            }
        }

        for(int i=1;i<ch.length;i++){
            if(ch[i]<='n'){
            diff += ch[i]-'a';
        }
            else{
                switch(ch[i]){
                case 'o': 
                    diff += 12;
                    break;

                case 'p':
                    diff += 11;
                    break;
                
                case 'q':
                    diff += 10;
                    break;
                case 'r':
                    diff += 9;
                    break;
                case 's':
                    diff+=8;
                    break;
                case 't':
                    diff += 7;
                    break;
                case 'u':
                    diff += 6;
                    break;
                case 'v':
                    diff+=5;
                    break;
                case 'w':
                    diff+=4;
                    break;
                case 'x':
                    diff +=3;
                    break;
                case 'y':
                    diff +=2;
                    break;
                case 'z':
                    diff +=1;
                    break;
            }
        }
        }

        System.out.println(diff);
        sc.close();
    }
}