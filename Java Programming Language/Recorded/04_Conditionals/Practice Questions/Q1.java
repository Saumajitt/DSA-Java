import java.util.*;

public class Q1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();

        if(number >= 0){
            System.out.println("The input number is positive!");
        } else{
            System.out.println("The input number is negative!");
        }
        
    }
}