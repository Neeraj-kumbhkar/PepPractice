package practice.code;

import java.util.Scanner;

public class reverseInt {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int i = scn.nextInt();
        while (i>0){
            System.out.print(i%10);
            i/=10;
        }
    }
}
