class Solution {

    public boolean check(char[][] board, char k, int row, int col){
        
        for(int i=0; i<9; i++){
            if(board[row][i] == k ) return false;
        }
        for(int i=0; i<9; i++){
            if(board[i][col] == k ) return false;
        }

        int x=(row/3)*3;
        int y=(col/3)*3;

        for(int i=x; i<x+3;i++){
            for(int j=y; j<y+3; j++){
                if(board[i][j] == k) return false;
            }
        }

        return true;
    }

    public boolean solve(char[][] board){

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                
                if(board[i][j] != '.') continue;

                for(int k=1; k<=9; k++){

                    char ch = (char)(k + '0');
                    if(!check(board,ch,i,j)) continue;
                    board[i][j] = ch;
                    
                    if(solve(board)) return true;
                    
                    board[i][j] = '.';

                }
                return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}