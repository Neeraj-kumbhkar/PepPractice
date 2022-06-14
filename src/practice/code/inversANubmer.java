package practice.code;

import java.util.Scanner;

public class inversANubmer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt(); 21453
        int originalPosition = 1;
        int inverse = 0;
        while (number>0){
            int originalDigit = number%10;
            inverse=inverse+originalPosition*(int)Math.pow(10,originalDigit-1);
             number = number/10;
             originalPosition++;
        }
        System.out.println(inverse);
    }
}
