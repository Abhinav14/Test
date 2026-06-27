package basicprograms;

import java.util.Stack;

public class ValidParantheses {

    private static boolean isValidParantheses(String str){
        char[] charArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(Character c : charArr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                char inner = stack.pop();
                if(c == ')' && inner != '('){return false;}
                if(c == '}' && inner != '{'){return false;}
                if(c == ']' && inner != '['){return false;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]]";
        System.out.println(isValidParantheses(str));
    }

}
