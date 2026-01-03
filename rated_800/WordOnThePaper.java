package rated_800;
import java.util.*;
public class WordOnThePaper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> a = new ArrayList<>();
        while(t-- >0){
            String[] grid = new String[8];
            for(int i=0;i<8;i++){
                grid[i]=sc.nextLine();
            }
            String word = "";
           
            for(int i=0;i<8;i++){
                StringBuilder rowWord = new StringBuilder();
                for(int j = 0;j<8;j++){
                char c = grid[i].charAt(j);
                if(c>='a' && c<= 'z'){
                    rowWord.append(c);
                }

                if(rowWord.length()>0){
                    word = rowWord.toString();
                }
                a.add(word);
            }

            }
        }

        for(String result: a){
            System.out.println(result);
        }
        sc.close();
    }
}
