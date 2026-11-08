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
        