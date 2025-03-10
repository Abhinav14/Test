package march032025;

import java.util.Stack;

public class ValidParanthese {

    public static boolean isValid(String str){
        Stack<Character> stk = new Stack<>();
        for(Character c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }else{
                if(stk.isEmpty()){return false;}
                char open = stk.pop();
                if(c == ')' && open != '('){return false;}
                if(c == '}' && open != '{'){return false;}
                if(c == ']' && open != '['){return false;}
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(isValid(str));
    }
}
