package java8.lambda;

public class MyFunctionalInterfaceTester {
    public static void main(String[] args) {
        MyFunctionalInterface result = (a, b) -> a+b;

        int sum = result.sumOf2Nums(10, 15);

        System.out.println(sum);

    }
}
