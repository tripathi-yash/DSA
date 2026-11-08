class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        row = {}
        col = {}
        mat = {}

        for i in range(9):
            row[i] = set()
            col[i] = set()


        for i in range(9):
            for j in range(9):
                mat[(i//3,j//3)] = set()
        
        for i in range(9):
            for j in range(9):

                if board[i][j] == '.':
                    continue

                if( board[i][j] in row[i] or
                    board[i][j] in col[j] or 
                    board[i][j] in mat[(i//3,j//3)] ):

                    return False

                row[i].add(board[i][j])
                col[j].add(board[i][j])
                mat[(i//3,j//3)].add(board[i][j])

        return True