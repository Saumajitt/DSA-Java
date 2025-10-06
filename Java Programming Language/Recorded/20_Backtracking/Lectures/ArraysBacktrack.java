import java.util.Arrays;

public class ArraysBacktrack {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println("Array after the call stack is empty: " + Arrays.toString(arr));
    }


    static void changeArr(int[] arr, int i, int val){
        //base case
        if(i == arr.length){
            System.out.println("Base Case Array: " + Arrays.toString(arr));
            return;
        }

        //recursive call
        arr[i] = val;
        changeArr(arr, i+1, val+1);  //recursive function call
        arr[i] = arr[i]-2; // backtracking step is always after the recursive call
    }
}
