import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }


    static void prettyPrintBoard(char[][] board){
        System.out.println("-------- Chess Board --------");
            for (char[] r : board) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println();
    }

    static void nQueens(char[][] board, int row){

        //base case
        if(row == board.length){
            prettyPrintBoard(board);;
            return;
        }


        
        for(int j = 0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] ='x'; //backtrack step
       } 
    }
    
}
