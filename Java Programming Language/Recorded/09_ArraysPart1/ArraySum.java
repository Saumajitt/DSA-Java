
public class ArraySum {
    public static void main(String[] args) {
        int[] arr  = {2,4,6,8,10};
        int ans = arraySum(arr);
        System.out.println("The array sum is: " + ans);


    }

    static int arraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
}
