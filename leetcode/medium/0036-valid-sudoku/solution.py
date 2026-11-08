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
