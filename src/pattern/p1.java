package pattern;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int sp = 1;
         for(int i=st;i>=0;i--){
             System.out.println(i);
             st--;
             for(int j=1;i>=st;j--) {
                 System.out.println(j);
                 sp++;
             }
         }

    }
}
