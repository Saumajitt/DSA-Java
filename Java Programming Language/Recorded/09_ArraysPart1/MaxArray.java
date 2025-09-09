

public class MaxArray{
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 7, 8, 9, 3 };
        System.out.println(maxArray(arr));
    }


    static int maxArray(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;

    }
}