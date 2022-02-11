package dp.dynamic.programming;

public class Dp {
    public static void display(int[] dp){
      for (int i:dp) System.out.println(i);
        System.out.println();
    }
    public static void display2D(int[][] dp){
        for (int[] i:dp){
            for (int j:i) System.out.println(j+" ");
            System.out.println();
        }
    }

    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
       int f = fibo(6);
        System.out.println(f);
    }
}
