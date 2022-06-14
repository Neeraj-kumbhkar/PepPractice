package practice.code;

public class FibbnociSeries {
    public static void main(String[] args) {
        int n=7;
         0 1 1 2 3 5 8
        int b=1;
        int c = 0;
        System.out.println(0);
        for(int i = 0; i<n-1;i++){
            int a=b;
            b=c;
            c = a+b;
            System.out.println(c);
        }

    }
}
