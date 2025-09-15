public class SpiralMatrix {
    public static void printSpiral(int[][] mat){
        int startRow = 0;
        int endRow = mat.length -1;
        int startCol = 0;
        int endCol = mat.length -1;


        while(startRow <= endRow && startCol <= endCol){
            //top boundary
            for(int j =startCol; j<= endCol; j++){
                System.out.print(mat[startRow][j] + " ");
            }
            
            // right boundary
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + " ");
            }
            
            // bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(mat[endRow][j] + " ");
            }
            
            // left boundary
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(mat[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
            
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        printSpiral(mat);
    }
}
