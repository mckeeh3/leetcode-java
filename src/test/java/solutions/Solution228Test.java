package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution228.
 */
public class Solution228Test {
    @Test
    public void ranges1() {
        Solution228 solution228 = new Solution228();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> ranges = solution228.summaryRanges(nums);

        assertTrue(ranges.size() == 3);
        assertEquals("0->2", ranges.get(0));
        assertEquals("4->5", ranges.get(1));
        assertEquals("7", ranges.get(2));
    }

    @Test
    public void ranges2() {
        Solution228 solution228 = new Solution228();
        int[] nums = {0, 2, 3, 4, 5, 7, 10, 11, 12, 13, 14, 18, 20, 21, 22};
        List<String> ranges = solution228.summaryRanges(nums);

        assertTrue(ranges.size() == 6);
        assertEquals("0", ranges.get(0));
        assertEquals("2->5", ranges.get(1));
        assertEquals("7", ranges.get(2));
        assertEquals("10->14", ranges.get(3));
        assertEquals("18", ranges.get(4));
        assertEquals("20->22", ranges.get(5));
    }
}
