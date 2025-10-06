
public class Question2 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0;
        System.out.println(searchInRotatedArray(nums, target));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you did not find a pivot then the array is not roted then do normal binary search
         
    }
    
 
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            
            int mid = start + (end - start)/2;
            // 4 cases
            if(mid < end && nums[mid] > nums[mid+1] ){
                return mid;
            }if(mid > start && nums[mid] < nums[mid+1]){
                return mid -1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

}
