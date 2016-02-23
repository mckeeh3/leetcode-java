package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution171.
 */
public class Solution171Test {
    @Test
    public void numberForTitleAIs1() {
        Solution171 solution171 = new Solution171();
        assertEquals(1, solution171.titleToNumber("A"));
    }

    @Test
    public void numberForTitleZIs26() {
        Solution171 solution171 = new Solution171();
        assertEquals(26, solution171.titleToNumber("Z"));
    }

    @Test
    public void numberForTitleAAIs27() {
        Solution171 solution171 = new Solution171();
        assertEquals(27, solution171.titleToNumber("AA"));
    }

    @Test
    public void numberForTitleZZIs27() {
        Solution171 solution171 = new Solution171();
        assertEquals(702, solution171.titleToNumber("ZZ"));
    }
}
