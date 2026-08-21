package june2026.dsa.repeats;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(thirdLargest(inputArray));
    }

    private static int thirdLargest(int[] inputArray){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int n : inputArray){
            if(n > largest){
                third = second;
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                third = second;
                second = n;
            } else if (n > third && n != second && n != largest) {
                third = n;
            }
        }
        return third;
    }
}
