package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] nge1 =  nge(arr);
        for(int res:nge1){
            System.out.println(res);
        }
    }

    private static int[] nge(int[] arr) {
        int[] ngeArr = new int[arr.length];
        Stack<Integer> st =  new Stack<>();
        st.push(arr[arr.length-1]);
        ngeArr[ngeArr.length-1] = -1;
        for(int i= arr.length-2;i>=0;i--){
            while (st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ngeArr[i]=-1;
            } else{
                ngeArr[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ngeArr;
    }
}
