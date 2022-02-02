package pep.recursion.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n==0) return 1;
       // expactation  5*factorial(4)
        return n*factorial(n-1);
    }
}
