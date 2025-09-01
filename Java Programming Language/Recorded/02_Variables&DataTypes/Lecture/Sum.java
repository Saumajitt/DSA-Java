import java.util.*;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        // if(sum>90){
        //     System.out.println(sum);
        // } else {
        //     System.out.println("add something greater than 0 to make it more than 90");
        // }

        System.out.println("The required sum is : " +sum);
    }
    
}
