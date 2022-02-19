package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isBalanceBracket(str);
    }

    private static void isBalanceBracket(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch:str.toCharArray()){
            //opening bracket
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            } else if(ch == ')') {
                boolean val=handle(st,'(');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            } else if(ch=='}'){
                boolean val=handle(st,'{');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            } else if(ch==']'){
                boolean val =  handle(st,'[');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean handle(Stack<Character> st,char bracket) {
        if (st.isEmpty()) {
            return false;
        }else if (st.peek() != bracket) {
            return false;
        } else {
            st.pop();
            return true;
            }
        }
}
