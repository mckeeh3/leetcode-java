package solutions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution036.
 */
public class Solution036Test {
    @Test
    public void validBoard1IsValid() {
        Solution036 solution036 = new Solution036();
        assertTrue(solution036.isValidSudoku(validBoard1()));
    }

    @Test
    public void validBoard2IsValid() {
        Solution036 solution036 = new Solution036();
        assertTrue(solution036.isValidSudoku(validBoard2()));
    }

    @Test
    public void invalidBoard1IsInvalid() {
        Solution036 solution036 = new Solution036();
        assertFalse(solution036.isValidSudoku(invalidBoard()));
    }

    private char[][] validBoard1() {
        List<String> rows = new ArrayList<>(9);
        rows.add("53..7....");
        rows.add("6..195...");
        rows.add(".98....6.");
        rows.add("8...6...3");
        rows.add("4..8.3..1");
        rows.add("7...2...6");
        rows.add(".6....28.");
        rows.add("...419..5");
        rows.add("....8..79");
        return initBoard(rows);
    }

    private char[][] validBoard2() {
        List<String> rows = new ArrayList<>(9);
        rows.add(".87654321");
        rows.add("2........");
        rows.add("3........");
        rows.add("4........");
        rows.add("5........");
        rows.add("6........");
        rows.add("7........");
        rows.add("8........");
        rows.add("9........");
        return initBoard(rows);
    }

    private char[][] invalidBoard() {
        List<String> rows = new ArrayList<>(9);
        rows.add("....5..1.");
        rows.add(".4.3.....");
        rows.add(".....3..1");
        rows.add("8......2.");
        rows.add("..2.7....");
        rows.add(".15......");
        rows.add(".....2...");
        rows.add(".2.9.....");
        rows.add("..4......");
        return initBoard(rows);
    }

    private char[][] initBoard(List<String> rows) {
        char[][] board = new char[9][9];

        for (int row = 0; row < 9; row++) {
            board[row] = rows.get(row).toCharArray();
        }
        return board;
    }
}
