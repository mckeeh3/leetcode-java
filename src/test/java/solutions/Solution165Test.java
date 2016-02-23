package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution165.
 */
public class Solution165Test {
    @Test
    public void version1isGreaterThan0() {
        Solution165 solution165 = new Solution165();
        assertEquals(1, solution165.compareVersion("1", "0"));
    }

    @Test
    public void version0isLessThan1() {
        Solution165 solution165 = new Solution165();
        assertEquals(-1, solution165.compareVersion("0", "1"));
    }

    @Test
    public void version1isLessThan1dot1() {
        Solution165 solution165 = new Solution165();
        assertEquals(-1, solution165.compareVersion("1", "1.1"));
    }
}
