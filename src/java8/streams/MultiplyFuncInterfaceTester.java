package java8.streams;

public class MultiplyFuncInterfaceTester {
    public static void main(String[] args) {
        MultiplyFunctionalInterface total = (int a, int b) -> a*b;
        int result = total.multiply(5, 10);
        System.out.println(result);
    }
}
