import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse*10) + lastDigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
