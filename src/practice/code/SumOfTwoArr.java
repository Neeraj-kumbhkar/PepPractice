package practice.code;

import java.util.Scanner;

public class SumOfTwoArr {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0;i<n2;i++){
            a2[i] = sc.nextInt();
        }
       //   3 1 0 7 5
        //1 1 1 1 1 1
       // 1 4 2 1 8 6
        //    max=6
        int[] res = new int[n1>n2?n1:n2];
        int p1 = a1.length-1;
        int p2 = a2.length-1;
        int p3 = res.length-1;
        int carry = 0;
        while (p3>=0){
            int digit = carry;
            if (p1>=0){
                digit+=a1[p1];
            }
            if (p2>=0){
                digit+=a2[p2];
            }
            carry = digit/10;
            digit %= 10;
            res[p3] = digit;
            p1--;
            p2--;
            p3--;
        }
        if(carry!=0) System.out.print(carry);
        for(int i :res){
            System.out.print(i);
        }
    }
}
