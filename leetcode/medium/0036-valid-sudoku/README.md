# Valid Sudoku

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Determine if a `9 x 9` Sudoku board is valid. Only the filled cells need to be validated  **according to the following rules** :

- Each row must contain the digits 1-9 without repetition.
- Each column must contain the digits 1-9 without repetition.
- Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 **Note:** 

- A Sudoku board (partially filled) could be valid but is not necessarily solvable.
- Only the filled cells need to be validated according to the mentioned rules.

 

 **Example 1:** 

```
Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true

```

 **Example 2:** 

```
Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

```

 

 **Constraints:** 

- board.length == 9
- board[i].length == 9
- board[i][j] is a digit 1-9 or '.'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.96%)  
**Memory:** 45.8 MB (beats 89.34%)  
**Submitted:** 2026-11-08T13:13:12.954Z  

```java
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



        
```

---

[View on LeetCode](https://leetcode.com/problems/valid-sudoku/)