import java.util.*;
public class CodeforcesChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <String> result = new ArrayList<>();
        for(int i=0;i<t;i++){
            char ch = sc.next().charAt(0);
            if(Character.isLowerCase(ch)){
                switch (ch) {
                    case 'c':
                        result.add("YES");
                        break;
                    case 'o':
                        result.add("YES");
                        break;
                    case 'd':
                        result.add("YES");
                        break;
                    case 'e':
                        result.add("YES");
                        break;
                    case 'f':
                        result.add("YES");
                        break;
                    case 'r':
                        result.add("YES");
                        break;
                    case 's':
                        result.add("YES");
                        break;
                    default:
                        result.add("NO");
                        break;
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }

        for(String r: result){
            System.out.println(r);
        }
    }
}
