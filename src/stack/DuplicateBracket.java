package stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine(); (a + b) + ((c + d)) should be true
        System.out.println(duplicatBracket(str));
    }

    private static boolean duplicatBracket(String str) {
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == ')'){
                if(st.peek() == '(')  return true;
                while (st.peek()!='(') st.pop();
                st.pop();
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}
