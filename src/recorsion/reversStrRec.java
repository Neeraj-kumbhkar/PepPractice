package recorsion;

import java.util.*;

public class reversStrRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reStrRec(s));
    }

    private static String reStrRec(String s) {
        if(s.length()==0)  return "";
        String faith = reStrRec(s.substring(1));
        return faith + s.charAt(0);
    }
}
