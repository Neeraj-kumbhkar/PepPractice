package practice.code;

import java.util.Scanner;

public class InverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] inv = new int[arr.length];
        for (int i = 0; i<n; i++){
            inv[arr[i]] = i;
        }

    }
}
