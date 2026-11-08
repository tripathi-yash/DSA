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
**Runtime:** 2 ms (beats 66.97%)  
**Memory:** 46.2 MB (beats 72.60%)  
**Submitted:** 2026-11-08T12:58:16.008Z  

```java
class Solution {

    public boolean unique(char[][] board, int[] indices){

        int lastRowIdx = indices[0];
        int lastColIdx = indices[1];

        for(int currRowIdx = indices[0] - 3; currRowIdx < lastRowIdx; currRowIdx++){

            for(int currColIdx = indices[1] - 3; currColIdx < lastColIdx; currColIdx++){
                
                char currVal;
                if(board[currRowIdx][currColIdx] != '.'){

                    currVal = board[currRowIdx][currColIdx];

                    for(int i = indices[0] - 3 ; i < lastRowIdx; i++){

                        for(int k = indices[1] - 3 ; k < lastColIdx; k++){

                            if( (currVal == board[i][k]) && (i != currRowIdx || k != currColIdx) ){
                                return false;
                            }  
                        }
                    }

                }
            }
        }

        return true;
    }

    public boolean unique(char[] arr){

        for(int i=0; i<arr.length; i++){

            char val = arr[i];
            for(int j=0; j<arr.length; j++){
                
                if( arr[i] != '.' && (i != j) && (arr[j] == val)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        
        // row check
        for(int i=0; i<9; i++){

            char[] arr = new char[board.length];
            for(int j=0; j<9; j++){
                
                arr[j] = board[i][j]; 
            }
            if(!unique(arr)){
                return false;
            }
        }

        // column check
        for(int i=0; i<9; i++){

            char[] arr = new char[board.length];

            for(int j=0; j<9; j++){
                
                arr[j] = board[j][i]; 
            }
            if(!unique(arr)){
                return false;
            }
        }

        // 3 * 3 matrix check
        int[][] indices = {{3,3},{3,6},{3,9},{6,3},{6,6},{6,9},{9,3},{9,6},{9,9}};
        
        for(int i=0; i<9; i++){

            int[] currIdxPairs = indices[i];

            if(!unique(board,currIdxPairs)){
                return false;
            }
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-sudoku/)