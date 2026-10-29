# N-Queens II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The  **n-queens**  puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return  *the number of distinct solutions to the  **n-queens puzzle***.

 

 **Example 1:** 

```
Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.

```

 **Example 2:** 

```
Input: n = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= n <= 9

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 90.30%)  
**Memory:** 41.9 MB (beats 72.36%)  
**Submitted:** 2026-10-29T18:05:08.359Z  

```java
class Solution {

    int count = 0;

    public void solve(int row, int n, char[][] board, List<List<String>> ans, boolean[] columns, boolean[] rightDiag, boolean[] leftDiag){

        // base case
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<n; i++) temp.add(new String(board[i]));
            ans.add(temp);
            count++;
            return;
        }

        for(int col=0; col<n; col++){
            
            if( columns[col] || rightDiag[row+col] || leftDiag[row-col+n-1]) continue;
            
            board[row][col] = 'Q';
            columns[col] = true;
            rightDiag[row+col] = true;
            leftDiag[row-col+n-1] = true;

            solve(row+1,n,board,ans,columns,rightDiag,leftDiag);

            board[row][col] = '.';
            columns[col] = false;
            rightDiag[row+col] = false;
            leftDiag[row-col+n-1] = false;

        }
    }

    public int totalNQueens(int n) {
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

        return count;
    }

        

}
```

---

[View on LeetCode](https://leetcode.com/problems/n-queens-ii/)