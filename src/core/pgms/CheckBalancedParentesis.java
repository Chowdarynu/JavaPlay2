package core.pgms;

import java.util.Stack;

public class CheckBalancedParentesis {

    public static void main(String[] args) {
        String checkBalancedExpr1 = checkBalancedParentesis("a*(b+c)-(d*e)");
        System.out.println("a*(b+c)-(d*e) : " + checkBalancedExpr1);
        String checkBalancedExpr2 = checkBalancedParentesis("(a*(b-c)*{d+e}");
        System.out.println("(a*(b-c)*{d+e} : " + checkBalancedExpr2);
    }

    public static String checkBalancedParentesis(String expr) {
        if (expr.isEmpty())
            return "Balanced";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }
    public boolean isBalanced(String str){
        Stack stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(i);
            else if (ch == ')'|| ch == ']' || ch == '}')
            {
                //nothing to match with
                if(stack.isEmpty())
                {
                    return false;
                }
               /* else if(stack.pop() != ch)
                {
                    return false;
                }*/

            }
        }
        return stack.isEmpty();
    }

}