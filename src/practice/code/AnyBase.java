package practice.code;

import java.util.Scanner;

public class AnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase = scn.nextInt();

        int res = getValue(n, sourceBase, destBase);
        System.out.println(res);
    }
    public static int getValue(int n, int b1, int b2) {
        int dec = getValueInDecimal(n, b1);
        int dn = getValueInBase(dec, b2);
        return dn;
    }

    public static int getValueInDecimal(int n, int b1) {
        int it =0;
        int res = 0;
        while(n>0){
            int rem = n%10;
            res += rem*(int)Math.pow(b1,it++);
            n /=10;
        }
        return res;
    }

    public static int getValueInBase(int n, int b2) {
        int it = 0;
        int res = 0;
        while (n > 0) {
            int rem = n % b2;
            res += rem * (int) Math.pow(10, it++);
            n /= b2;
        }
        return res;
    }
}
