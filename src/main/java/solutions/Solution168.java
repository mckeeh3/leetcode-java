package solutions;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/">168. Excel Sheet Column Title</a>
 */
public class Solution168 {
    public String convertToTitle(int n) {
        return title(n, "");
    }

    private String title(int n, String title) {
        title = letter(n) + title;
        n = (n - 1) / 26;
        return n > 0 ? title(n, title) : title;
    }

    private String letter(int n) {
        int letter = n % 26;
        return String.format("%c", "A".charAt(0) + (letter == 0 ? 25 : letter - 1));
    }
}
