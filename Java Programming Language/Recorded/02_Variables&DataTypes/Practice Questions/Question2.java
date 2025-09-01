import java.util.Scanner;

public class Question2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        double side = sc.nextDouble();
        
        double area = side * side;
        System.out.println("The required area of the square is: " + area + " with side: " + side);

    }
}
