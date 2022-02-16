package recorsion;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrom(s));
    }

    private static boolean isPalindrom(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrom(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

}
