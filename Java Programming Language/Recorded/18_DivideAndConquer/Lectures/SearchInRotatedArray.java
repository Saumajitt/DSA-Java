public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = searchInRotatedSortedArray(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }


    static int searchInRotatedSortedArray(int[] arr,int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target <= arr[mid]){
                return searchInRotatedSortedArray(arr, target, start, mid);
            }else{
                return searchInRotatedSortedArray(arr, target, mid+1, end);
            }
        }  else{
            if(arr[mid] <= target && target <= arr[end]){
                return searchInRotatedSortedArray(arr, target, mid +1 , end);
            }else{
                return searchInRotatedSortedArray(arr, target, start, mid -1);
            }
        }


       
    }
}
