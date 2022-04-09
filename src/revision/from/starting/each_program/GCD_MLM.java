package revision.from.starting.each_program;

import java.util.Scanner;

public class GCD_MLM {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b  = sc.nextInt();
            int ao=a;
            int bo=b;
            while(b>0){
                int rem = a%b;
                a=b;
                b = rem;
            }
            System.out.println(a);
            System.out.println(ao*bo/a);
        }
    }
