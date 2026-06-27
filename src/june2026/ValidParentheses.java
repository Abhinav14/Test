package june2026;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[{()}}]";
        System.out.println(isValidParantheses(str));
    }

    private static boolean isValidParantheses(String str){
        char[] charArray = str.toCharArray();
        Stack<Character> holder = new Stack<>();
        for(char c : charArray){
            if(c == '(' || c == '{' || c == '['){
                holder.push(c);
            }else {
                if(holder.isEmpty()){
                    return false;
                }else {
                    char opening = holder.pop();
                    if(c == ')' && opening != '('){
                        return false;
                    }
                    if(c == '}' && opening != '{'){
                        return false;
                    }
                    if(c == ']' && opening != '['){
                        return false;
                    }
                }
            }
        }
        return holder.isEmpty();
    }
}
