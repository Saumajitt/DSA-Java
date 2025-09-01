import java.util.*;
public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        // Pattern1(n);
        //Pattern2(n);
        //Pattern3(n);
        Pattern4(n);
         

    }

    // Star Pattern 1
    static void Pattern1(int n){
        for(int i = 0; i<n ; i++){
            // for each line
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void Pattern4(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

    static void Pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
