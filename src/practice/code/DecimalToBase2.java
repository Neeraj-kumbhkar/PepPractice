package practice.code;

import java.util.Scanner;

public class DecimalToBase2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div = 2;
        int it = 0;
        int ans = 0;
        while (n > 0) {
            int rem = n % div;
            ans += rem*(int)Math.pow(10, it++);
            n/=div;
        }
        System.out.println(ans);
    }
}
