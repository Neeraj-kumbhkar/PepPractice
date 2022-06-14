package dp.dynamic.programming;

import java.util.Scanner;

public class LeetCode70StaireCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(rec(n));
            int[] qb = new int[n+1];
            System.out.println(recMemoization(n,qb));
            System.out.println(recTabulation(n,qb));
        }
    /*private static int rec(int n) {
        if (n<0) return 0;
        if(n==0) return 1;
        return rec(n-1)+rec(n-2);
    }*/

   /* private static int recMemoization(int n, int[] qb) {
        if (n<0) return 0;
        if(n==0) return qb[n] = 1;
        if(qb[n]!=0) return qb[n];
        return qb[n] =  recMemoization(n-1,qb)+ recMemoization(n-2,qb);
    }*/
    private static int recTabulation(int N, int[] qb) {
        for(int n=0;n<=N;n++){
            if(n<=1){
                qb[n] = 1;
                continue;
            }
            qb[n] = qb[n-1]+qb[n-2];
        }
        return qb[N];
    }
}
