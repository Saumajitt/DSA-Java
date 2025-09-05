import java.util.*;

class Patterns{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int numRows = sc.nextInt();
        // int numCols = sc.nextInt();

        // hollow_rectangle(4,5);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(5);
    }


    static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i = 1; i<=totRows; i++){
            //inner loop 
            for(int j = 1 ; j<=totCols; j++){
                //cell -> (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void inverted_rotated_half_pyramid(int n){
        for(int rows = 1; rows <=n ; rows++){
            for(int spaces = 1; spaces <= n-rows ; spaces++){
                System.out.print(" ");
            }
            for(int stars =1; stars <= rows; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void inverted_half_pyramid(int n){
        for(int rows = 1; rows <= n ; rows++){
            for(int cols = 1 ; cols<= n - rows +1; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void butterfly(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void solid_rhombus(int n){
        for(int i = 1; i <=n ;i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void hollow_rhombus(int n){
        for(int i =1; i<=n; i++){

            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j =1; j<=n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }  

            System.out.println(); 
        }
    }

    static void diamond(int n){
        for(int i =1; i<=n;i++){
            for(int j = 1; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=(2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}