package pattern;

import java.util.Scanner;

public class PrintStart2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        int sp = 0;
        for (int i = 0; i < n; i++) {
            //System.out.print(sp);
            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for (int j=0;j<st;j++){
                System.out.print("*\t");
            }
           // System.out.print(st);
            st--;
            sp++;
            System.out.println();
        }
    }
}