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

**Language:** Python  
**Runtime:** 17 ms (beats 5.22%)  
**Memory:** 12.3 MB (beats 71.07%)  
**Submitted:** 2026-11-08T12:57:16.419Z  

```py
class Solution(object):

    def check(self, board, row, col, num):

        for i in range(9):
            if i != col and board[row][i] == num:
                return False
            if i != row and board[i][col] == num:
                return False

        r = (row//3)*3
        c = (col//3)*3

        for i in range(r,r+3):
            for j in range(c,c+3):       
                if i != row and j != col and board[i][j] == num:
                    return False
        
        return True

    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for row in range(9):
            for col in range(9):
                if board[row][col] != '.':
                    if not self.check(board,row,col, board[row][col]):
                        return False

        return True
        
```

---

[View on LeetCode](https://leetcode.com/problems/valid-sudoku/)