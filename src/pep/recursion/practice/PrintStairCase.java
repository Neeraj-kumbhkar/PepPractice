package pep.recursion.practice;

import java.util.Scanner;

public class PrintStairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairCase(n,"");
    }

    private static void printStairCase(int n, String s) {
        if(n<=0){
            if(n==0){
                System.out.println(s);
            }
            return;
        }
        printStairCase(n-1, s+"1");
        printStairCase(n-2, s+"2");
        printStairCase(n-3, s+"3");
    }
}
