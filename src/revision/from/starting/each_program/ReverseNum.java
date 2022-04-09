package revision.from.starting.each_program;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            System.out.println(n%10);
            n /= 10;
        }
    }
}
