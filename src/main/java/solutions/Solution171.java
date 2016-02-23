package solutions;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a>
 */
public class Solution171 {
    public int titleToNumber(String s) {
        int n = 0;
        int a = "A".charAt(0);

        if (s == null) {
            return 0;
        }
        for (char c : s.toCharArray()) {
            n = n * 26 + c - a + 1;
        }
        return n;
    }
}
