package solutions;

/**
 * Determine if a Sudoku is valid, according to:
 * <a href="http://sudoku.com.au/TheRules.aspx">Sudoku Puzzles - The Rules</a>.
 * <p>The Sudoku board could be partially filled, where empty cells are filled with the character '.'.</p>
 *
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */
public class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (isInvalidRow(board, i) || isInvalidColumn(board, i)) {
                return false;
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int column = 0; column < 9; column += 3) {
                if (invalidSubBox(board, row, column)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isInvalidRow(char[][] board, int row) {
        char[] digits = " 123456789".toCharArray();

        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                if (digits[board[row][i] - '0'] == ' ') {
                    return true;
                } else {
                    digits[board[row][i] - '0'] = ' ';
                }
            }
        }
        return false;
    }

    private boolean isInvalidColumn(char[][] board, int column) {
        char[] digits = " 123456789".toCharArray();

        for (int i = 0; i < 9; i++) {
            if (board[i][column] != '.') {
                if (digits[board[i][column] - '0'] == ' ') {
                    return true;
                } else {
                    digits[board[i][column] - '0'] = ' ';
                }
            }
        }
        return false;
    }

    private boolean invalidSubBox(char[][] board, int row, int column) {
        char[] digits = " 123456789".toCharArray();

        for (int r = row; r < row + 3; r++) {
            for (int c = column; c < column + 3; c++) {
                if (board[r][c] != '.') {
                    if (digits[board[r][c] - '0'] == ' ') {
                        return true;
                    } else {
                        digits[board[r][c] - '0'] = ' ';
                    }
                }
            }
        }
        return false;
    }
}
