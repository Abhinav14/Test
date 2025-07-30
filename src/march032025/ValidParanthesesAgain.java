package march032025;

import java.util.Stack;

public class ValidParanthesesAgain {

    public static boolean checkValidParantheses(String str){
        Stack<Character> stack = new Stack<>();

        for(Character c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                char open = stack.pop();
                if(c == ')' && open != '('){return false;}
                if(c == '}' && open != '{'){return false;}
                if(c == ']' && open != '['){return false;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]]";
        System.out.println(checkValidParantheses(str));
    }

}
