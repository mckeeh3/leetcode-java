package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution028.
 */
public class Solution028Test {
    @Test
    public void emptyHaystackAndEmptyNeedle() {
        Solution028 solution028 = new Solution028();
        assertEquals(0, solution028.strStr("", ""));
    }

    @Test
    public void haystackContainsNeedleHello() {
        Solution028 solution028 = new Solution028();
        assertEquals(23, solution028.strStr("this haystack contains World as the needle", "World"));
    }
}
