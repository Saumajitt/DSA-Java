public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }

    static void printSubArrays(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                int sum =0;
                for(int k = start; k<=end; k++){
                    sum += arr[k];
                    System.out.print(arr[k] + " ");  
                }
                // ts++;
                System.out.println(" Sum: " + sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            System.out.println();
            System.out.println("The maximum Subarray Sum = " + maxSum);
        }

    }
}
