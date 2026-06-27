package june2026;

import java.util.Stack;

//1. Convert String to char array
//2. Create a Stack to hold parentheses
//3. Iterate char array and check if item is opening bracket and if yes put item to Stack
public class ValidParenthesesAgain {
    public static void main(String[] args) {
        String str = "(){}[]";
        System.out.println(isValidParentheses(str));
    }

    private static boolean isValidParentheses(String str){
        char[] charArr = str.toCharArray();
        Stack<Character> holder = new Stack<>();
        for(char c : charArr){
            if(c == '(' || c == '{' || c == '['){
                holder.push(c);
            }else{
                if(holder.isEmpty()){
                    return false;
                }else{
                    char openingBracket = holder.pop();
                    if(c == ')' && openingBracket != '('){return false;}
                    if(c == '}' && openingBracket != '{'){return false;}
                    if(c == ']' && openingBracket != '['){return false;}
                }
            }
        }
        return holder.isEmpty();
    }
}
