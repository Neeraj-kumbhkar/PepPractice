package revision.from.starting.each_program;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            boolean isPrime = true;
            for (int d = 2; d*d  < n; d++) {
                if (n % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime?"prime":"not prime");
        }
    }
}
