package august2025;

public class TestString {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        String s3 = "abc";

        String s4 = s1;
        String s5 = s3;

        String s6 = "abc";

        if(s1==s2){
            System.out.println("ref to s1 and s2 are equal");
        }else {
            System.out.println("ref to s1 and s2 are not equal");
        }

        if(s1.equals(s2)){
            System.out.println("content of s1 and s2 are equal");
        }else{
            System.out.println("content of s1 and s2 are not equal");
        }

        if(s3==s5){
            System.out.println("ref equal");
        }else{
            System.out.println("ref not equal");
        }

    }
}
