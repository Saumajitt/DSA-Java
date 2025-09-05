import java.util.*;

class Methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input the three numbers: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        
        // int average = AverageOfThree(a,b,c);
        // System.out.println("The required average of the three numbers is: " + average);

        System.out.println("Enter the number to check: ");
        int n = sc.nextInt();
        boolean ans = isEven(n);
        System.out.println("The input number gives the following result when passed through isEven function: " + ans);
    }

    static int AverageOfThree(int a, int b, int c){
            int sum = a+b+c;
            int avg = sum/3;
        return avg;
    }

    static boolean isEven(int n){
        
        boolean evenNum = false;
        if(n%2 == 0){
            evenNum = true;
        }

        return evenNum;
    }
}