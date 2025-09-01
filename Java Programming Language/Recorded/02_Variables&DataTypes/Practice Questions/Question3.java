import java.util.Scanner;

public class Question3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of items: ");
        float pencilCost = sc.nextFloat();
        float penCost = sc.nextFloat();
        float eraserCost = sc.nextFloat();


        float totalCost = pencilCost+penCost+eraserCost;
        float gst = 0.18f*totalCost;
        float finalCost = totalCost + gst; 

        
        System.out.println("The total cost without gst is: " + totalCost);
        System.out.println("The final cost after adding GST is: " + finalCost);


    }
}
