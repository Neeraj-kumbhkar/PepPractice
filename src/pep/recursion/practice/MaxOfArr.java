package pep.recursion.practice;

import java.util.Scanner;

public class MaxOfArr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        System.out.println(mxArr(a1, 0));
    }

    private static int mxArr(int[] a1, int i) {
        if (i==a1.length) return i;
         return (int)Math.max(a1[i],mxArr(a1,i+1));
    }

}
