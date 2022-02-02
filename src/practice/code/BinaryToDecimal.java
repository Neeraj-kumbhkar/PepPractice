package practice.code;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int binaryNum = scn.nextInt();
        int iteration = 0;
        int dec = 0;
        int oct = 0;
        while(binaryNum>0){
           int bDigit = binaryNum%10;
           dec += bDigit*(int)Math.pow(2,iteration++);
           binaryNum /= 10;
        }
        System.out.println(dec);
        int base = 8;
        int it1 = 0;
        while (dec>0){
            int rem = dec%base;
            oct +=rem*(int)Math.pow(10,it1++);
            dec /= base;
        }
        System.out.println(oct);
    }
}
