package java8.lambda;

public class LambdaRunner {
    public static void main(String[] args) {
        Bird eagle = ()-> System.out.println("Eagle can fly");

        eagle.canFly();
    }
}
