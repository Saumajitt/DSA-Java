import java.util.Arrays;

public class QuickSort {
     public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {

        // base case
        if (start >= end) {
            return;
        }
        

        int pivotIndex = partition(arr,start,end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);

    }


    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start -1;
        for(int j =start; j<end; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;


        return i;
    }
}
 