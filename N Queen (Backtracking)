public class NQueens {

    static void NQueen(int[][] board, int row, int n) {

        // Base case: all queens placed
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // Try placing queen in each column of the current row
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 1;      // Place queen

                NQueen(board, row + 1, n);

                board[row][j] = 0;      // Backtrack
            }
        }
    }

    static boolean isSafe(int[][] board, int row, int column, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][column] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = column; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] board = new int[n][n];

        NQueen(board, 0, n);
    }
}
