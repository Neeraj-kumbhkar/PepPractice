package pattern;

import java.util.Scanner;

public class Patternn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ins = -1;   //inner space outer space
        int ots = n/2;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=ots;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=1;j<=ins;j++){
                System.out.print("\t");
            }
            if(i>1&&i<n) System.out.print("*\t");
            if(i<=n/2){
                ins+=2;
                ots--;
            } else {
                ins-=2;
                ots++;
            }
            System.out.println();
        }

    }
}
