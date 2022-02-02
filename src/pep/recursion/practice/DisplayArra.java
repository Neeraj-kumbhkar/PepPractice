package pep.recursion.practice;

import java.util.Scanner;

public class DisplayArra {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        dArr(a1, 0);
    }

    public static void dArr(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        dArr(arr, idx+1);

    }

}
