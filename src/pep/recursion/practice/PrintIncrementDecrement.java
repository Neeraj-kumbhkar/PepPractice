package pep.recursion.practice;

import java.util.Scanner;

public class PrintIncrementDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasingRec(n);
    }

    private static void printIncreasingRec(int n) {
        //expactaion  1234554321
        //faith
        int i = 0;
        printIncreasingRec1(n, i);
    }

    public static void printIncreasingRec1(int n, int i) {
        if (i>=n) return;
        i+=1;
        System.out.println(i);
        printIncreasingRec1(n, i);
        System.out.println(i);
    }
}
