package pep.recursion.practice;

import java.util.Scanner;

public class PrintDecreasing {
    ///expactation  5 4 3 2 1
   // expactation  print 5 --> PrintDecreasing(4)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        printDecreasingRec(n);
    }

    private static void printDecreasingRec(int n) {
        if(n==0) return;
        System.out.println(n);
        printDecreasingRec(n-1);
    }

}
