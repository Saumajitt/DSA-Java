
public class Decreasing {
    public static void main(String[] args) {
        // decreasing(5);
        // increasing(5);
        // System.out.println(fact(5));
        System.out.println(sum(5));
    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }


    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n - 1);
        System.out.print(n + " ");
    }


    static int fact(int n){
        if(n==0){
            return 1; 
        }
        return n*fact(n-1);
    }
    
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }


    

   
}


