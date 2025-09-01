import java.util.*;

public class Q2 {
   public static void main(String[]args) {
    System.out.println("Enter your body temperature: ");
    Scanner sc = new Scanner(System.in);
    double temp = sc.nextDouble();

    if(temp >= 100){
        System.out.println("You have fever!");
    }else{
        System.out.println("You do not have fever, just chill.");
    }
   } 
}
