package revision.from.starting.each_program;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = (int)Math.log10(n)+1;
        k%=nod;
        if(k<0) k+=nod;
        for(int i=0;i<k;i++){
            int id = n%10;
            n/=10;
            n+=id*(int)Math.pow(10,nod-1);
        }
        System.out.println(n);
    }
}
