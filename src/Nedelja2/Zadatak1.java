package Nedelja2;

import java.util.Scanner;
import java.util.Stack;

public class Zadatak1 {
    public static String reverseWord(String str){
        if(str.equals("")){
            return str;
        }
        Stack<Character> reverse = new Stack<>();
        char [] c= str.toCharArray();
        for(int i = 0;i<str.length();i++){
            reverse.push(c[i]);
        }

        int j = 0;
        while(!reverse.isEmpty()){
            c[j++]=reverse.pop();
        }
        return String.copyValueOf(c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWord(str));
    }
}
