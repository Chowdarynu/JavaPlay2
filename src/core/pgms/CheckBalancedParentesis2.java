package core.pgms;

import java.util.Stack;

public class CheckBalancedParentesis2 {

   public static void main(String[] args) {
      String checkBalancedExpr1 = checkBalancedParentesis("{([])}");
      System.out.println(" : " + checkBalancedExpr1);
   }

   public static String checkBalancedParentesis(String string) {
      if (string.isEmpty()) {
         return "Yes";
      }

      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < string.length(); i++) {
         char ch = string.charAt(i);
         if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
         } else {
            if (stack.isEmpty()) {
               return "NO";
            } else {
               char pop_val = stack.pop();
               if (ch == ')' && pop_val != '(') {
                  return "NO";
               } else if (ch == '}' && pop_val != '{') {
                  return "NO";
               } else if (ch == ']' && pop_val != '[') {
                  return "NO";
               }
            }
         }
      }
      return stack.isEmpty() ? "Yes" : "No";
   }

}