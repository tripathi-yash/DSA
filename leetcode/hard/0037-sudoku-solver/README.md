# Sudoku Solver

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy  **all of the following rules** :

- Each of the digits 1-9 must occur exactly once in each row.
- Each of the digits 1-9 must occur exactly once in each column.
- Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

The `'.'` character indicates empty cells.

 

 **Example 1:** 

```
Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:

```

 

 **Constraints:** 

- board.length == 9
- board[i].length == 9
- board[i][j] is a digit or '.'.
- It is guaranteed that the input board has only one solution.

## Solution

**Language:** Java  
**Runtime:** 255 ms (beats 50.76%)  
**Memory:** 42.2 MB (beats 97.13%)  
**Submitted:** 2026-10-29T23:23:44.962Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sudoku-solver/)