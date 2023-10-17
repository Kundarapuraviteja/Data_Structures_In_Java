package Expression_Conversions;

import java.util.Stack;

public class infix_to_prefix {
    static int precedence(char c){
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

    public static String infytopre(String str){
        String res="";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetterOrDigit(c))
                res+=c;
            else if(c==')')
                s.push(c);
            else if(c=='('){
                while (!s.isEmpty() && s.peek()!=')'){
                    res+=s.peek();
                    s.pop();
                }
                s.pop();
            }
            else {
                while (!s.isEmpty() && precedence(c)<=precedence(s.peek())){
                    res+=s.peek();
                    s.pop();
                }
                s.push(c);
            }
        }

        while (!s.isEmpty()){
            if(s.peek()=='(' ||s.peek()==')')
                return "invalid expression";
            res+=s.peek();
            s.pop();
        }
        return res;
    }


    public static void main(String[] args) {
        String str="(a+b)+(d*e)/w",s="";
        for(int i=str.length()-1;i>=0;i--) s+=str.charAt(i);
        System.out.println(infytopre(s));
    }
}
