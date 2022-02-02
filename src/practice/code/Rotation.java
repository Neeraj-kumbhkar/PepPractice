package practice.code;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int rotateBy = scn.nextInt();
        int numberOfDigit = (int)Math.log10(number)+1;
        System.out.println("numberOfDigit "+numberOfDigit);
        rotateBy %= numberOfDigit;
        if(rotateBy<0){
            rotateBy += numberOfDigit;
        }
        int division = 1;
        int multiplier = 1;
        for(int i = 0; i<numberOfDigit; i++){
            if(i<rotateBy){
                division *=10;
            } else {
                multiplier *=10;
            }
        }
        System.out.println("division "+division);
        System.out.println("multiplier "+multiplier);
        int quotation = number/division;
        int reminder = number%division;
        int rotation = reminder*multiplier+quotation;
        System.out.println(rotation);
    }
}
