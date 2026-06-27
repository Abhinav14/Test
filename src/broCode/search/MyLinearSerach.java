package broCode.search;

public class MyLinearSerach {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 7);

        if(index != -1){
            System.out.println("Element Found at: "+index);
        }else{
            System.out.println("Element not found.");
        }
    }

    private static int linearSearch(int[] array, int target) {
        for(Integer i : array){
            if(i == target){
                return i;
            }
        }
        return -1;
    }
}
