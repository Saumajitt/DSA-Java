import java.util.*;

public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("The required area of circle is : " + area + " with the radius of : " + rad +"cm");
    }
}
