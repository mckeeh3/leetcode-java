package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution292.
 */
public class Solution292Test {
    @Test
    public void variousStoneCountsWork() {
        Solution292 solution292 = new Solution292();

        assertFalse(solution292.canWinNim(4));
        assertFalse(solution292.canWinNim(8));
        assertFalse(solution292.canWinNim(12));

        assertTrue(solution292.canWinNim(5));
        assertTrue(solution292.canWinNim(6));
        assertTrue(solution292.canWinNim(7));
    }
}
