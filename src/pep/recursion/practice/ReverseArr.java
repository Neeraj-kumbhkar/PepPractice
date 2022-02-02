package pep.recursion.practice;

import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        revArr(a1, 0);
    }
    private static void revArr(int[] a1, int i) {
        if(i==a1.length) return;
        revArr(a1,i+1);
        System.out.println(a1[i]);
    }
}
