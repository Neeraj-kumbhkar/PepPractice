package pattern;

import java.util.Scanner;

public class PrintStarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1, st = 1; // sp = spaces ; st = stars  for(int i =1; i<=n;i++)
        {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < sp; j++) {
                    System.out.print("\t");
                }
                for (int j = 0; j < st; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
                sp--;
                st++;
            }
        }
    }

}
