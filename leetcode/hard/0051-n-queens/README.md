# N-Queens

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The  **n-queens**  puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return  *all distinct solutions to the  **n-queens puzzle***. You may return the answer in  **any order**.

Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

 

 **Example 1:** 

```
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

```

 **Example 2:** 

```
Input: n = 1
Output: [["Q"]]

```

 

 **Constraints:** 

- 1 <= n <= 9

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.88%)  
**Memory:** 45.7 MB (beats 98.70%)  
**Submitted:** 2026-10-29T17:56:10.845Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/n-queens/)