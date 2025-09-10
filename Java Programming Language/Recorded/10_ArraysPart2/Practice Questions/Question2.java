
public class Question2 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0;
        System.out.println(searchInRotatedArray(nums, target));

    }
 
    static int searchInRotatedArray(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

}
