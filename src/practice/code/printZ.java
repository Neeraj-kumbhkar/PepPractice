package practice.code;

import java.util.Scanner;

public class printZ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        for(int i=lo;i<=hi;i++){
            int n = i;
            int primeNum = 0;
            int count=0;
            if(n==2||n==3){
                primeNum = n;
            }
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                } else {
                        primeNum = n;
                }
            }
            if(primeNum!=0 && count==0) System.out.println(primeNum);
        }
    }
}