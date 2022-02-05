package pep.recursion.practice;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printSubSeq(s,"");
    }

    private static void printSubSeq(String qus,String ans) {
        if(qus.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = qus.charAt(0);
        String ros = qus.substring(1);
        printSubSeq(ros,ans+ch);
        printSubSeq(ros,ans+"");
    }
}
