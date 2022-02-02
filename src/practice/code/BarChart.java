package practice.code;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max,arr[i]);
        }
        for (int j = max; j>=1; j--){
            for(int b:arr){
                if (b>=j) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

}
