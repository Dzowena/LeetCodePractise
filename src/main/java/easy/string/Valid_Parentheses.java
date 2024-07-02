package easy.string;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid(")[]{}"));
    }

    public static boolean isValid(String s) {
        if (s.length() == 1)
            return false;
        Stack<Character> parenthesesStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                parenthesesStack.push(s.charAt(i));
                continue;
            }
            if(parenthesesStack.isEmpty()){
                return false;
            }
            if(s.charAt(i) == ')')
                if(parenthesesStack.peek() == '(')
                    parenthesesStack.pop();
                else return false;
            if(s.charAt(i) == '}')
                if(parenthesesStack.peek() == '{')
                    parenthesesStack.pop();
                else return false;
            if(s.charAt(i) == ']')
                if(parenthesesStack.peek() == '[')
                    parenthesesStack.pop();
                else return false;
        }
        return parenthesesStack.isEmpty();
    }
}