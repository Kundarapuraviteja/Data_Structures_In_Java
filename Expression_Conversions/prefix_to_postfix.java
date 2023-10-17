package Expression_Conversions;

import java.util.Stack;

public class prefix_to_postfix {
    static  boolean isop(char c){
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
    static String pretopost(String str){
        Stack<String> stack=new Stack<>();
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            if(isop(c)){
                String a=stack.peek();
                stack.pop();
                String b=stack.peek();
                stack.pop();
                s=a+b+c;
                stack.push(s);
            }
            else
                stack.push(c+"");
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(pretopost("+a*bc"));
    }
}
