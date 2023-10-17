package Expression_Conversions;

import java.util.Stack;

public class infix_to_postfix {

    static  int precedence(char c){
        switch (c){
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infytopost(String str){
        String res="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c))
                res+=c;
            else if(c=='(')
                stack.push(c);
            else if(c==')'){
                while (!stack.isEmpty() && stack.peek()!='('){
                    res+=stack.peek();
                    stack.pop();
                }
                stack.pop();

            }
            else{
                while (!stack.isEmpty() && precedence(c)<=precedence(stack.peek())){
                    res+=stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()){
            if(stack.peek()=='(')
                return "invalid expression";
            res+=stack.peek();
            stack.pop();
        }
        return res;

    }


    public static void main(String[] args) {
        System.out.println(infytopost("(a+b)*c/b"));

    }
}
