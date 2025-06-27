import java.util.*;

public class Caps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isAllUpperCase(s) || isFirstLowerRestUpper(s)) {
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result);
        } else {
            System.out.println(s);
        }
        sc.close();
    }

    private static boolean isAllUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) return false;
        }
        return true;
    }

    private static boolean isFirstLowerRestUpper(String s) {
        if (s.length() < 2) return Character.isLowerCase(s.charAt(0));
        if (!Character.isLowerCase(s.charAt(0))) return false;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) return false;
        }
        return true;
    }
}
