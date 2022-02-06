package pep.recursion.practice;

import java.util.Scanner;

public class PrintKPC {
    public static String[] mapArr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }

    public static void printKPC(String str, String fsf) {
        if(str.length()==0){
            System.out.println(fsf);
            return;
        }
        int digit = (int)str.charAt(0)-'0';
        String keyPad = mapArr[digit];
        for (char ch:keyPad.toCharArray()){
            printKPC(str.substring(1), fsf+ch);
        }
    }

}

