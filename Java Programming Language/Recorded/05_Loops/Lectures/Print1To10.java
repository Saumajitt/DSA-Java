import java.util.*;
public class Print1To10 {
    public static void main(String[] args) {
        // int count = 1;
        // while(count<=10){
        //     System.out.print(count + " ");
        //     count ++;
        // }

        // with input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int count = 1;
        while(count <= n){
            System.out.print(count + " ");
            count++;
        }
    }
}
