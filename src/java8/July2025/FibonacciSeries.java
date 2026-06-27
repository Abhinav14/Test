package java8.July2025;

public class FibonacciSeries {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        int result = 0;
        System.out.print(prev+" ");
        System.out.print(next+" ");
        for (int i = 0; i < 8; i++){
            result = prev + next;
            System.out.print(result+" ");
            prev = next;
            next = result;
        }
    }
}
