class Solution {

    public boolean check(char[][] board, int row, int col, char num) {
        // 1. Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == num) {
                return false;
            }
            if (i != row && board[i][col] == num) {
                return false;
            }
        }

        // Find the 3x3 block top-left corner (Java integer division drops the remainder automatically)
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        // 2. Check the 3x3 box
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                // Only skip the exact current cell itself
                if (i == row && j == col) {
                    continue;
                }
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // Skip checking empty cells (handles character '.')
                if (board[row][col] == '.') {
                    continue;
                }

                if (!check(board, row, col, board[row][col])) {
                    return false;
                }
            }
        }

        return true;
    }
}
