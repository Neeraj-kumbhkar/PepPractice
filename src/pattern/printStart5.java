package pattern;

import java.util.Scanner;

public class printStart5 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n / 2, stars = 1;  //spaces = spaces ; st = stars
        for (int i = 1; i <= n; i++)
        {
            for(int j=0;j<spaces;j++){
                System.out.print("\t");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*\t");
            }
            if ( i <= n / 2)
            {
                spaces--;
                stars += 2;
            }
            else
            {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
