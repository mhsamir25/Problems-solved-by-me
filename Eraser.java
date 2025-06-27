import java.util.*;
public class Eraser{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Integer> results =  new ArrayList<>();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int res = 0;
            int i = 0;
            String s = sc.nextLine();
            while(i<n){ 
                if(s.charAt(i)=='B'){
                    res++;
                    i += k;
                }
                else{
                    i++;
                }
            }

            results.add(res);
            
        }

        for(int r: results){
            System.out.println(r);
        }
        
    }
}