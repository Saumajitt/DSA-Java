import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 ==0)) ;

        if (x && (y||z)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year!");
        }

        

    }
}

