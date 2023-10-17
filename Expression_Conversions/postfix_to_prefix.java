package Expression_Conversions;

import java.util.Stack;

public class postfix_to_prefix {

    static  boolean isoperator(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }


    static String posttopre(String str){
        String res="";
        Stack<String> stack=new Stack<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(isoperator(c)){
                String a=stack.peek();
                stack.pop();
                String b=stack.peek();
                stack.pop();
                String st=c+b+a;
                stack.push(st);


            }
            else
            stack.push(c+"");
        }
        for(String c:stack)
            res+=c;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(posttopre("ab+cd*/"));
    }
}
