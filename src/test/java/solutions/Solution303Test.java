package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution303.
 */
public class Solution303Test {
    @Test
    public void sumRangeWorks() {
        int[] numbers = {-2, 0, 3, -5, 2, -1};
        Solution303 solution303 = new Solution303(numbers);

        assertTrue(1 == solution303.sumRange(0, 2));
        assertTrue(-1 == solution303.sumRange(2, 5));
        assertTrue(-3 == solution303.sumRange(0, 5));
    }
}
