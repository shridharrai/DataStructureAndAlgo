public class PrintNQueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        printNQueens(chess, 0, "");
    }

    public static void printNQueens(int[][] chess, int row, String placesSoFar) {
        if(row == chess.length) {
            System.out.println(placesSoFar);
            return;
        }

        for(int col = 0; col < chess.length; ++col) {
            if(isSafePlace(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, row + 1, placesSoFar + row + "-" + col + ", ");
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafePlace(int[][] chess, int row, int col) {
        // check vertically
        for(int i = row - 1, j = col; i >= 0; --i) {
            if(chess[i][j] == 1) return false;
        }

        // check right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; --i, ++j) {
            if(chess[i][j] == 1) return false;
        }

        // check left digonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; --i, --j) {
            if(chess[i][j] == 1) return false;
        }

        return true;
    }
}