package practice.code;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        boolean isPrime = true;
        for (int i=0; i<t; i++){
            int n = scn.nextInt();
            for (int div = 2;div*div<=n;div++){
                if (n%div==0){
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime?"prime":"not prime");
        }
    }
}
