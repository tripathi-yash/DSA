class Solution {

    public boolean check(char[][] board, int row, int col, int num){

        for(int i=0; i<9; i++){

            if(i != col && board[row][i] == num) return false;
            if(i != row && board[i][col] == num) return false;
        }

        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        for(int j=r; j<r+3; j++){
            for(int k=c; k<c+3; k++){

                if(j!=row && k!=col && board[j][k] == num) return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(board[i][j] != '.'){
                    if(!check(board, i, j, board[i][j])) return false;
                }
            }    
        }
        return true;
    }
}



        