import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the week number: ");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();
        
        switch (dayNum) {
            case 1: System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;            
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Input!");
                break;
        }
    }
}
