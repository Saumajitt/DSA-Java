import java.util.*;

public class Matrix {
    public static boolean search(int[][] matrix, int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Element: " + matrix[i][j] + " found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;

    }
    public static void main(String[] args) {
        // int [][] matrix = new int[3][3]; //cell = rows * columns = 3*3 = 9
        int [][] mat = { 
            {2,3,5,7},
            {25,4,21,3},
            {0,9,2,2},
            {10,9,1,2},
        };

        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[i].length; j++){
        //         matrix[i][j] = sc.nextInt();
        //     } 
        // }
        // System.out.println();
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
            
        //     System.out.println();
        // }

        boolean ans = search(mat, 25);
        System.out.println(ans);
        
    }    
}
