import java.util.*;
public class Polyhedron {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i=0;i<n;i++){
            String s = sc.nextLine();

            switch (s) {
                case "Tetrahedron":
                    count +=4;
                    break;
                
                case "Cube":
                    count += 6;
                    break;
                case "Octahedron":
                    count += 8;
                    break;
                case "Dodecahedron":
                    count += 12;
                    break;
                case "Icosahedron":
                    count += 20;
                    break;
                default: System.out.println("Invalid Input");
                    break;
            }
        }

        System.out.println(count);
    }
}
