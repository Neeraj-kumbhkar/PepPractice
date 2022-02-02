package practice.code;

import java.util.Scanner;

public class DigonalPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for(int r1 = 0;r1<arr.length;r1++){
            for (int c1 = 0;r1<arr[0].length;c1++){
                arr[r1][c1] = scn.nextInt();
            }
        }
        dgPrint(arr);
    }

    private static void dgPrint(int[][] arr) {
       for(int r=0;r<arr.length;r++){

       }
    }
}
