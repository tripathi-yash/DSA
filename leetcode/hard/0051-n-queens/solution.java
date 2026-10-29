class Solution {

    public void solve(int row, int n, char[][] board, List<List<String>> ans, boolean[] columns, boolean[] rightDiag, boolean[] leftDiag){

        // base case
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<n; i++) temp.add(new String(board[i]));
            ans.add(temp);
            return;
        }

        for(int col=0; col<n; col++){
            
            if( columns[col] || rightDiag[row+col] || leftDiag[row-col+n-1]) continue;

            board[row][col] = 'Q';
            columns[col] = true;
            leftDiag[row-col+n-1] = true;
            rightDiag[row+col] = true;

            solve(row+1,n,board,ans,columns,rightDiag,leftDiag);

            board[row][col] = '.';
            columns[col] = false;
            leftDiag[row-col+n-1] = false;
            rightDiag[row+col] = false;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        List<List<String>> ans = new ArrayList<>();
        // create an empty board

        boolean[] columns = new boolean[n];
        boolean[] rightDiag = new boolean[2*n-1];
        boolean[] leftDiag = new boolean[2*n-1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        solve(0, n , board , ans, columns,rightDiag,leftDiag);

        return ans;
    }
}