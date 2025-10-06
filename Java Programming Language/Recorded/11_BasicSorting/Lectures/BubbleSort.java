import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] nums = {5,4,1,3,2};  // {4,1,3,2,5} --> {1,3,2,4,5} --> {1,2,3,4,5}
        // int n = nums.length;
        // System.out.println(n);
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("after sorting with bubble sort: " + Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums){
        boolean swapped = false;
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length-i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {  // therefore array is sorted no need to continue the outer loop
                break;
            }
        }
       
    }
}
