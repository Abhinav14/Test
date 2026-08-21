package june2026.dsa.repeats;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 4, 5, 6, 9, 10};
        System.out.println(secondLargest(inputArray));
    }

    private static int secondLargest(int[] inputArray){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int n : inputArray){
            if(n > largest){
                second = largest;
                largest = n;
            }else if(n > second && n != largest){
                second = n;
            }
        }
        return second;
    }
}
