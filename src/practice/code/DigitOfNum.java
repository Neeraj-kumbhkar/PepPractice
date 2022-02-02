package practice.code;

import java.util.Scanner;

public class DigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod = (int) Math.log10(n) + 1;
        int div = (int)Math.pow(10,nod-1);
        while(div>0){
            int num = n / div;
            System.out.println(num);
            n%=div;
            div /=10;
        }

       /* int power = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }

        temp = n;
        while (power != 0) {
            int digit = temp / power;
            System.out.println(digit);

            temp = temp % power;
            power = power / 10;
        }*/
    }
}