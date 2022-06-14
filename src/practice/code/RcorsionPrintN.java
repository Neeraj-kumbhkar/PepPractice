package practice.code;

import java.util.Scanner;

public class RcorsionPrintN {
    print 12344321
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();*/
        printN(5);
    }

    private static void printN(int n) {
        int it = 1;
        printWithIt(it,n);
        String str ="asfd";


    }

    private static void printWithIt(int it, int n) {
        if(it>n) return;
        System.out.println(it);
        printWithIt(it+1, n);
        System.out.println(it);
    }
}
