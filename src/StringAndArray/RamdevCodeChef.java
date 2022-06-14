package StringAndArray;

import java.util.Scanner;
https:www.codechef.com/problems/RAMDEV
public class RamdevCodeChef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), b= sc.nextLong();
        int N= sc.nextInt();
        long ans = 0;
        for(int i =0;i<N;i++){
            long L = sc.nextLong(),B=sc.nextLong();
            ans+=Math.max(L/l*B/b,L/b*B/l);
        }
        System.out.println(ans);
    }
}
