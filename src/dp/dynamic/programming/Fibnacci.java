package dp.dynamic.programming;

import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] qb = new int[n+1];
        System.out.println("recursive "+fib(n));
        System.out.println("memoization "+fibMemo(n,qb));
        System.out.println("tabulization "+fibTab(n,qb));
    }

    private static int fibTab(int N, int[] qb) {
        for(int i = 0;i<N;i++){
            if(i<=1){
               qb[i]=i;
               continue;
            }
            qb[i] = qb[i-1]+qb[i-2];
        }
        return qb[N];
    }

    private static int fib(int n) {
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }

    private static int fibMemo(int n, int[] qb) {
        if(n==0||n==1) return n;
        if(qb[n]!=0){
            return qb[n];
        }
        int fb = fibMemo(n-1, qb)+fibMemo(n-2, qb);
        qb[n]=fb;
        return fb;
    }
}
