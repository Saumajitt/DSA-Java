import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int start, int end){
        
        // base case
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid); // left part of the array
        mergeSort(arr, mid+1, end); // right part of the array

        merge(arr , start , mid, end);


    }


    static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start;  // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for the temp array
           

        while(i <= mid && j<=end ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }


        // for remaining elements
        //left part
        while(i<=mid){
            temp[k++] = arr[i++]; 
        }

        //right part
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy elememts from temp to original
        for(k = 0, i = start ;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
}

 