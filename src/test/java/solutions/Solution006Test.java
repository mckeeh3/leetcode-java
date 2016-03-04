package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution006.
 */
public class Solution006Test {
    @Test
    public void inputEmptyRow1outputEmpty() {
        Solution006 solution006 = new Solution006();
        assertTrue("".equals(solution006.convert("", 1)));
    }

    @Test
    public void input_PAYPALISHIRING_row3output_PAHNAPLSIIGYIR() {
        Solution006 solution006 = new Solution006();
        assertTrue("PAHNAPLSIIGYIR".equals(solution006.convert("PAYPALISHIRING", 3)));
    }

    @Test
    public void input_PAYPALISHIRING_rows4output_PINALSIGYAHRPI() {
        Solution006 solution006 = new Solution006();
        assertTrue("PINALSIGYAHRPI".equals(solution006.convert("PAYPALISHIRING", 4)));
    }
}
