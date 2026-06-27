package august2025;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

    private static boolean isValid(String str){
        char[] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character c : charArr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                Character closingBracet = stack.pop();
                if(c == ')' && closingBracet != '('){return false;}
                if(c == '}' && closingBracet != '{'){return false;}
                if(c == ']' && closingBracet != '['){return false;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(isValid(str));
    }

}
