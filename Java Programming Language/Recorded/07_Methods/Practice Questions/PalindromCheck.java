import java.util.*;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        // boolean ans = isPalindrome(number);

        if(isPalindrome(number)){
            System.out.println("Number: " + number + " is a palindrome");
        }else{
            System.out.println("Number: " + number + " is not a palindrome");
        }
    }
        

    static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome%10;
            reverse = reverse*10 + remainder;
            palindrome = palindrome/10;
        }

        if(n == reverse){
            return true;
        }

        return false;

    }
    
}
