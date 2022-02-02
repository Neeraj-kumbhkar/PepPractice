package practice.code;

import java.util.Scanner;

public class PrintWave {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int cols = scn.nextInt();
        int[][] tda = new int[row][cols];
        for (int i = 0; i < tda.length; i++) {
            for (int j = 0; j < tda[i].length; j++) {
                tda[i][j] = scn.nextInt();
            }
        }
        wave(tda);
    }

    public static void wave(int[][] arr) {
        int c = 0;
        while (c < arr[0].length) {
            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c]);
                }
            } else {
                for (int r = arr.length-1 ; r >= 0; r--) {
                    System.out.print(arr[r][c]);
                }
            }
            c++;
        }
    }
}
