package rated_800;
import java.util.*;
public class Alarm {
    public static boolean isAllZeroes(int[] arr){
        if(arr == null){
            return false;
        }

        if(arr.length == 0){
            return false;
        }

        for(int element: arr){
            if(element!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> results = new ArrayList<>();
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            sc.nextLine();
            int[] door = new int[n];
            for(int j=0;j<n;j++){
                door[j]=sc.nextInt();
            }
            if(isAllZeroes(door)){
                System.out.println("Invalid input, all doors can't be open");
                for(int j=0;j<n;j++){
                door[j]=sc.nextInt();
            }
            }
            boolean possible = false;
            
            for(int k=0;k<n;k++){
                boolean ok = true;

                for(int l = 0;l<n;l++){
                    if(door[l]==1){
                        if(l<k || l>=k+x){
                            ok =false;
                            break;
                        }
                    }
                }
                if(ok){
                    possible = true;
                    break;
                }
            }
            String result = possible? "YES":"NO";
            results.add(result);
            }
            for(String res: results){
            System.out.println(res);
        }
        sc.close();    
        }

        
        
    }
//Problem link: https://codeforces.com/contest/2117/problem/A
