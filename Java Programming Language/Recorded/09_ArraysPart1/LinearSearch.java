public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,2,4,7,8,9,3};
        System.out.println(linearSearch(arr, 10));

    }

    static int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found!");
                return arr[i];
            }
        }
        return -1;
    }
    
}
