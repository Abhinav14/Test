package basicprograms;

public class RemoveWhiteSpaces {
    public static String removeSpace(String str){
        String resultString = str.replaceAll(" ", "");
        return resultString;
    }

    public static String withoutBuiltIn1(String str){
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : strArr){
            sb.append(s);
        }
        return sb.toString();
    }

    public static String withoutBuiltIn2(String str){
        String[] strArr = str.split(" ");
        String result = "";
        for(String s : strArr){
            result = result+s;
        }
        return result;
    }

    public static String withoutBuiltIn3(String str){
        char[] charArr = str.toCharArray();
        String result = "";
        for(Character c : charArr){
            if(c != ' '){
                result = result+c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Abhinav is looking for some development assignments";
        //System.out.println(removeSpace(str));
        System.out.println(withoutBuiltIn3(str));
    }
}
