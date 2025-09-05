import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int ans = DigitSum(number);
        System.out.println("The required sum of digits of the input number is: " + ans);
    }

    static int DigitSum(int num){
        int sum = 0;
        while(num != 0){
            int lastDigit = num%10;
            sum += lastDigit;
            num = num/10;
        }
        return sum;
    }
    
}
