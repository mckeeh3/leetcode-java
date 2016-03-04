package solutions;

/**
 * he string <code>"PAYPALISHIRING"</code> is written in a zigzag pattern on a given number of rows like this:
 * <pre>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * </pre>
 * <p>And then read line by line: <code>"PAHNAPLSIIGYIR"</code></p>
 * <p>Write the code that will take a string and make this conversion given a number of rows:</p>
 * <p><code>convert("PAYPALISHIRING", 3)</code> should return <code>"PAHNAPLSIIGYIR"</code>.</p>
 *
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/">6. ZigZag Conversion</a>
 */
public class Solution006 {
    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty()) {
            return "";
        } else if (numRows < 2) {
            return s;
        }

        int rowCurrent = 0;
        char[] result = new char[s.length()];
        int posInput = 0;
        int posOutput = 0;
        int row = 0;
        boolean directionDown = true;

        while (rowCurrent < numRows) {
            if (row == rowCurrent) {
                result[posOutput++] = s.charAt(posInput);
            }
            posInput++;
            row += directionDown ? 1 : -1;
            if (row < 0 || row >= numRows) {
                row = directionDown ? numRows - 2 : 1;
                directionDown = !directionDown;
            }
            if (posInput >= s.length()) {
                posInput = 0;
                directionDown = true;
                row = 0;
                rowCurrent++;
            }
        }
        return new String(result);
    }
}
