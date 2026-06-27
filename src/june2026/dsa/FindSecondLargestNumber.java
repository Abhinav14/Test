package june2026.dsa;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] nums1 = {12, 35, 1, 10, 34, 1};
        int[] nums2 = {10, 10, 10};

        System.out.println(secondlargest(nums1));
        System.out.println(secondlargest(nums2));

    }

    private static int secondlargest(int[] inputArray){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int n : inputArray){
            if(n > largest){
                second = largest;
                largest = n;
            }else if (n > second && n != largest){
                second = n;
            }
        }
            return second;
        }
    }

