public class Power {
    public static void main(String[] args) {
        // System.out.println(power(2, 2));
        System.out.println(powerOptimized(2, 5));
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x* power(x, n-1);
    }

    public static int powerOptimized(int x, int n) {
        if(n==0){
            return 1;
        }
        int halfPower = powerOptimized(x, n/2);  //O(logn)
        int halfSquare =  halfPower*halfPower;

        if(n%2 != 0){
            halfSquare = x * halfSquare;
        }
       
        return halfSquare;
    }

}
