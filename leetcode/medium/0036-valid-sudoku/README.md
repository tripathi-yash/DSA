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
**Runtime:** 3 ms (beats 75.84%)  
**Memory:** 19.1 MB (beats 95.54%)  
**Submitted:** 2026-11-08T13:00:39.862Z  

```py
class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]] or List[List[int]]
        :rtype: bool
        """
        # Create 9 tracking sets each for rows, columns, and 3x3 boxes
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]

        for r in range(9):
            for c in range(9):
                val = board[r][c]

                # Skip empty cells (handles both standard string '.' or integer 0 formats)
                if val == '.' or val == 0:
                    continue

                # Map the 2D coordinates (r, c) to a 1D box index (0 to 8)
                box_idx = (r // 3) * 3 + (c // 3)

                # If the value is already present in this row, col, or box -> Invalid Sudoku
                if val in rows[r] or val in cols[c] or val in boxes[box_idx]:
                    return False

                # Otherwise, record the value
                rows[r].add(val)
                cols[c].add(val)
                boxes[box_idx].add(val)

        return True

```

---

[View on LeetCode](https://leetcode.com/problems/valid-sudoku/)