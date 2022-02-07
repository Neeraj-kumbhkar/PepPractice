package dp.dynamic.programming;

import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] qb = new int[n+1];
        //System.out.println(fib(n, qb));
        System.out.println(fibMemo(n,qb));
    }

    private static int fib(int n, int[] qb) {
        if(n==0||n==1) return n;
        return fib(n-1, qb)+fib(n-2, qb);
    }

    private static int fibMemo(int n, int[] qb) {
        if(n==0||n==1) return n;
        if(qb[n]!=0){
            return qb[n];
        }
        int fb = fib(n-1, qb)+fib(n-2, qb);
        qb[n]=fb;
        return fb;
    }
}
