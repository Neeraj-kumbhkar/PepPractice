package pep.recursion.practice;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();
            printIncreasingRec(n);
        }
    private static void printIncreasingRec(int n) {
        if (n==0) return;
        excpaction pi(5)= 1 2 3 4 5
        faith (pi 4)print   1 2 3 4
        printIncreasingRec(n-1);
        System.out.println(n);
    }
}
