package revision.from.starting.each_program;

import java.util.Scanner;

public class Invers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 1;
        int sum = 0;
        while (n>0){
            int x = n%10;
            sum+=y*(int)Math.pow(10,x-1);
            n/=10;
            y++;
        }
        System.out.print(sum);
    }
}
