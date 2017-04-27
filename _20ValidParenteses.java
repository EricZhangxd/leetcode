package leetcode;

import java.util.Stack;

/**
 * @Author Eric Zhang
 * @Date 2017/3/21 12:03
 */
public class _20ValidParenteses {
    public static void main(String[] args) {
        _20ValidParenteses a=new _20ValidParenteses();
        System.out.println(a.isValid("({})"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')'  && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[' )
                stack.pop();
            else if (c == '}' && !stack.isEmpty()  && stack.peek() == '{')
                stack.pop();
            else return false;
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }
}
