package basicprograms;

import java.util.Arrays;

public class GenerateFibonacci {
    private static int[] genFib(){
        int num1 = 0, num2 = 1;
        int[] result = new int[10];
        result[0] = num1;
        result[1] = num2;
        //result[2] = result[0] + result[1];
        for(int i = 2; i < 10; i++){
            result[i] = result[i-1] + result[i-1-1];
        }
        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(genFib()).forEach(x-> System.out.println(x));
    }
}
