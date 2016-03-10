package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution016.
 */
public class Solution016Test {
    @Test
    public void values4target1() {
        int[] numbers = {-1, 2, 1, -4};
        Solution016 solution016 = new Solution016();
        assertEquals(2, solution016.threeSumClosest(numbers, 1));
    }

    @Test
    public void values4targetMinus100() {
        int[] numbers = {1, 1, 1, 0};
        Solution016 solution016 = new Solution016();
        assertEquals(2, solution016.threeSumClosest(numbers, -100));
    }

    @Test
    public void values4target1expected0() {
        int[] numbers = {0, 2, 1, -3};
        Solution016 solution016 = new Solution016();
        assertEquals(0, solution016.threeSumClosest(numbers, 1));
    }
}
