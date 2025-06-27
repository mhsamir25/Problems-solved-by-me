package rated_900;
import java.util.*;
public class Dubstep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("WUB");

        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
            System.out.print(arr[i]+" ");
        }
    }
    sc.close();
    }
}
//https://codeforces.com/contest/208/problem/A